package io.github.ronycce445.forgekit.cli;

import io.github.ronycce445.forgekit.file.FileUtils;
import io.github.ronycce445.forgekit.json.JsonUtils;
import io.github.ronycce445.forgekit.core.StringUtils;

import java.nio.file.Path;

public final class CommandDispatcher {

    private CommandDispatcher() {
    }

    public static void dispatch(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        try {
            switch (args[0].toLowerCase()) {

                case "reverse":
                    handleReverse(args);
                    break;

                case "wc":
                    handleWordCount(args);
                    break;

                case "json-pretty":
                    handlePrettyJson(args);
                    break;

                default:
                    System.out.println("Unknown command: " + args[0]);
                    printUsage();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleReverse(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: forgekit reverse <text>");
            return;
        }

        System.out.println(StringUtils.reverse(args[1]));
    }

    private static void handleWordCount(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: forgekit wc <file>");
            return;
        }

        System.out.println(FileUtils.wordCount(Path.of(args[1])));
    }

    private static void handlePrettyJson(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: forgekit json-pretty <file>");
            return;
        }

        String json = FileUtils.read(Path.of(args[1]));
        System.out.println(JsonUtils.prettyPrint(json));
    }

    private static void printUsage() {
        System.out.println("""
                ForgeKit CLI

                Commands:
                  reverse <text>
                  wc <file>
                  json-pretty <file>
                """);
    }
}