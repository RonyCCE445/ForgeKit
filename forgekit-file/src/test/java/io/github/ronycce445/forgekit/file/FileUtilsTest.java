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
        Files.writeString(tempFile, "test");

        //Act

        String actual = FileUtils.read(tempFile);

        //Assert

        assertEquals("test", actual);



    }
}
