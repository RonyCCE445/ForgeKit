package io.github.ronycce445.forgekit.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
}
