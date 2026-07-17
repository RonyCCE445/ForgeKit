package io.github.ronycce445.forgekit.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FileUtils {
    private FileUtils() {

    }
    public static String read(Path path) throws IOException {
        return Files.readString(path);
    }
}
