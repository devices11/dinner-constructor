package ru.practicum.dinner;

public class ConsoleColor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    void printGreen (Object obj) {
        System.out.print(ANSI_GREEN + obj + ANSI_RESET);
    }

    void printlnGreen (Object obj) {
        System.out.println(ANSI_GREEN + obj + ANSI_RESET);
    }

    void printYellow (Object obj) {
        System.out.print(ANSI_YELLOW + obj + ANSI_RESET);
    }

    void printlnYellow (Object obj) {
        System.out.println(ANSI_YELLOW + obj + ANSI_RESET);
    }

    void printlnRed (Object obj) {
        System.out.println(ANSI_RED + obj + ANSI_RESET);
    }

    void printlnBlue(Object obj) {
        System.out.println(ANSI_BLUE + obj + ANSI_RESET);
    }
}
