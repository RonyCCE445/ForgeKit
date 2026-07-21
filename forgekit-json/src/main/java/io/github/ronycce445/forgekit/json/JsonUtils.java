package io.github.ronycce445.forgekit.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class JsonUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private JsonUtils() {

    }

    public static String prettyPrint(String json) throws IOException {
        JsonNode node = OBJECT_MAPPER.readTree(json);

        return OBJECT_MAPPER
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(node);

    }

    public static String minify(String json) throws IOException{
        JsonNode node = OBJECT_MAPPER.readTree(json);
        return OBJECT_MAPPER.writeValueAsString(node);
    }
    public static boolean isValid(String json){
        try {
            OBJECT_MAPPER.readTree(json);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static String toJson(Object object) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(object);
    }
}
