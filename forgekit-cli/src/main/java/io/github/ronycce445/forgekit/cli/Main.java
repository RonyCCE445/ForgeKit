package io.github.ronycce445.forgekit.cli;

public final class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        CommandDispatcher.dispatch(args);
    }
}