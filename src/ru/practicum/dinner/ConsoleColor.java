package ru.practicum.dinner;

import java.util.ArrayList;

public class ConsoleColor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    void printGreen (String text) {
        System.out.print(ANSI_GREEN + text + ANSI_RESET);
    }

    void printlnGreen (String text) {
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }

    void printlnGreen (ArrayList<String> text) {
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }

    void printYellow (String text) {
        System.out.print(ANSI_YELLOW + text + ANSI_RESET);
    }

    void printlnYellow (String text) {
        System.out.println(ANSI_YELLOW + text + ANSI_RESET);
    }

    void printlnRed (String text) {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }

    void printlnBlue(String text) {
        System.out.println(ANSI_BLUE + text + ANSI_RESET);
    }
}
