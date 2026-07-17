package io.github.ronycce445.forgekit.cli;

import io.github.ronycce445.forgekit.text.TextFormatter;

public class Main {
    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter();
        System.out.println(formatter.reverseText("ForgeKit"));
    }
}