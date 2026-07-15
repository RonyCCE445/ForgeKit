package io.github.ronycce445.forgekit.core;

public final class StringUtils {

    private StringUtils() {
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}