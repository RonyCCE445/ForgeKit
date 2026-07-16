package io.github.ronycce445.forgekit.core;

import java.util.Objects;

public final class StringUtils {

    private StringUtils() {
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String capitalize(String input){
        if(input.isEmpty()){
            return input;
        }
        return Character.toUpperCase(input.charAt(0))+input.substring(1);
    }

    public static boolean isPalindrome(String input){
        Objects.requireNonNull(input, "Input cannot be Null");
        return input.equals(reverse(input));
    }

    public static int wordCount(String input){
        Objects.requireNonNull(input, "input cannot be Null");

        if(input.isBlank()){
            return 0;

        }

        return input.trim().split("\\s+").length;

    }
}