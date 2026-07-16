package io.github.ronycce445.forgekit.text;

import io.github.ronycce445.forgekit.core.StringUtils;

import java.util.Objects;

public class TextFormatter {

    public String formatTitle(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        return StringUtils.capitalize(text.trim());
    }

    public String formatSentence(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        String trimmed = text.trim();

        if (trimmed.isEmpty()) {
            return trimmed;
        }

        return StringUtils.capitalize(trimmed);
    }

    public String reverseText(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        return StringUtils.reverse(text);
    }

    public int countWords(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        return StringUtils.wordCount(text);
    }

    public boolean isPalindrome(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        return StringUtils.isPalindrome(text);
    }
}