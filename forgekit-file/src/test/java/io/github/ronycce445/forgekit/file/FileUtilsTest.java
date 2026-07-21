package io.github.ronycce445.forgekit.file;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void readLinesShouldReturnAllLines() throws IOException {
        //Arrange
        Path tempFile = Files.createTempFile("temp",".txt");


       Files.write(tempFile, List.of(
               "Apple",
               "Banana",
               "Orange"
       ));


        //Act
       List<String> actual = FileUtils.readLines(tempFile);
        //Assert
       assertEquals(List.of("Apple","Banana","Orange"), actual);

    }

    @Test
    public void lineCountShouldReturnCorrectNumberOfLines() throws IOException {
        Path tempFile = Files.createTempFile("temp",".txt");
        Files.write(tempFile, List.of("Apple","Banana","Orange","Kiwi"));

        long actual = FileUtils.lineCount(tempFile);
        assertEquals(4L, actual);
    }

    @Test
    public void wordCountShouldReturnCorrectNumberOfLines() throws IOException {
        Path tempFile = Files.createTempFile("temp",".txt");
        Files.write(tempFile, List.of(
                "Java is awesome",
                "ForgeKit is growing",
                "Apache Maven rocks"
        ));

        long actual = FileUtils.wordCount(tempFile);

        assertEquals(9L,actual);
    }

    @Test
    public void isEmptyShouldReturnTrueForEmptyFile() throws IOException {
        Path tempFile = Files.createTempFile("temp",".txt");

        boolean actual = FileUtils.isEmpty(tempFile);
        assertTrue(actual);
    }

    @Test
    public void isEmptyShouldReturnFalseForNonEmptyFile() throws IOException {
        Path tempFile = Files.createTempFile("temp",".txt");
        Files.writeString(tempFile, "test");
        boolean actual = FileUtils.isEmpty(tempFile);

        assertFalse(actual);
    }

    @Test
    public void sha256ShouldReturnSameHashForSameContent() throws Exception {
        Path tempFile = Files.createTempFile("temp", ".txt");
        Files.writeString(tempFile, "ForgeKit");

        String hash1 = FileUtils.sha256(tempFile);
        String hash2 = FileUtils.sha256(tempFile);

        assertEquals(hash1, hash2);
    }

}
