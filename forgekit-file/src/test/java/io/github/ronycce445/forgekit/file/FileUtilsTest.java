package io.github.ronycce445.forgekit.file;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUtilsTest {
    @Test
    public void readShouldReturnFileContents() throws IOException {
        //Arrange
    Path tempFile = Files.createTempFile("temp",".txt");
        //Act
        Files.writeString(tempFile, "test");



        //Assert
        String actual = FileUtils.read(tempFile);
        assertEquals("test", actual);
    }

    @Test
    public void writeShouldWriteFileContents() throws IOException {
        //Arrange
        Path tempFile = Files.createTempFile("temp",".txt");

        //Act
        FileUtils.write(tempFile,"Test");

        //Assert

        String actual = Files.readString(tempFile);

        assertEquals("Test", actual);

    }
}
