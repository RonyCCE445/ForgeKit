package io.github.ronycce445.forgekit.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Stream;

public final class FileUtils {
    private FileUtils() {

    }
    public static String read(Path path) throws IOException {
        return Files.readString(path);
    }
    public static void write(Path path, String content) throws IOException{
        Files.writeString(path, content);
    }
    public static List<String> readLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }
    public static long lineCount(Path path) throws IOException{
        try(Stream<String> lines = Files.lines(path)){
            return lines.count();
        }
    }

    public static long wordCount(Path path) throws IOException{
        List<String> lines = readLines(path);
        long count = 0;
        for(String line : lines){
            if (line.isBlank()) {
                continue;
            }
            count += line.trim().split("\\s+").length;
        }
        return count;
    }

    public static boolean isEmpty(Path path) throws IOException {
        return Files.size(path) ==0;
    }

    public static String sha256(Path path) throws IOException, NoSuchAlgorithmException {
        byte[] bytes = Files.readAllBytes(path);

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] hash = digest.digest(bytes);

        StringBuilder builder = new StringBuilder();

        for(byte b: hash){
            builder.append(String.format("%02x", b));
        }

        return builder.toString();
    }
}
