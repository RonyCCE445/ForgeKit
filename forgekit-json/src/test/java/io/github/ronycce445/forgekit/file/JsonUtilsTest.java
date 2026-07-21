package io.github.ronycce445.forgekit.file;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class JsonUtilsTest {
    @Test
    public void prettyPrintShouldFormatJson() throws IOException {
        String json = "{\"name\":\"ForgeKit\",\"version\":1}";

        String actual = JsonUtils.prettyPrint(json);

        assertTrue(actual.contains("\n"));
        assertTrue(actual.contains("  "));
    }
    @Test
    public void minifyShouldRemoveWhitespace() throws IOException {
        String json = """
            {
              "name": "ForgeKit",
              "version": 1
            }
            """;

        String actual = JsonUtils.minify(json);

        assertEquals("{\"name\":\"ForgeKit\",\"version\":1}", actual);
    }
    @Test
    public void isValidShouldReturnTrueForValidJson() {
        assertTrue(JsonUtils.isValid("{\"name\":\"ForgeKit\"}"));
    }

    @Test
    public void isValidShouldReturnFalseForInvalidJson() {
        assertFalse(JsonUtils.isValid("{name:ForgeKit}"));
    }
    @Test
    public void toJsonShouldSerializeObject() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ForgeKit");

        String actual = JsonUtils.toJson(map);

        assertTrue(actual.contains("\"name\""));
        assertTrue(actual.contains("\"ForgeKit\""));
    }
}
