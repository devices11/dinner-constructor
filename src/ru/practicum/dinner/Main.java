package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static DinnerConstructor dc;
    static Scanner scanner;
    static ConsoleColor cc;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);
        cc = new ConsoleColor();

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1" -> addNewDish();
                case "2" -> generateDishCombo();
                case "3" -> {
                    return;
                }
                default -> cc.printlnRed("Некорректная команда!");
            }
        }
    }

    private static void printMenu() {
        cc.printlnYellow("Меню:");

        cc.printYellow("1");
        System.out.println(" - Добавить новое блюдо");

        cc.printYellow("2");
        System.out.println(" - Сгенерировать комбинации блюд");

        cc.printYellow("3");
        System.out.println(" - Выход");

        cc.printYellow("Введите одну из команд: ");
    }

    private static void addNewDish() {
        cc.printlnBlue("Введите тип блюда:");
        String dishType = scanner.nextLine();

        cc.printlnBlue("Введите название блюда:");
        String dishName = scanner.nextLine();

        dc.addNewDish(dishType, dishName);
    }

    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        int numberOfCombos = 0;

        while (!(numberOfCombos > 0)){
            try {
                cc.printlnBlue("Введите количество наборов, которые нужно сгенерировать:");
                numberOfCombos = scanner.nextInt();
                if (numberOfCombos <= 0) {
                    cc.printlnRed("Некорректный ввод. Ожидается целое положительное число");
                }
                scanner.nextLine();
            } catch (InputMismatchException E) {
                cc.printlnRed("Некорректный ввод. Ожидается целое положительное число");
                scanner.nextLine();
            }
        }

        cc.printlnBlue("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = " ";
        ArrayList<String> combinations = new ArrayList<>();

        while (!nextItem.isEmpty()) {
            nextItem = scanner.nextLine();
            if (dc.checkType(nextItem)) {
                combinations.add(nextItem);
            } else {
                if (!nextItem.isEmpty())
                    cc.printlnRed("Такого типа блюда в меню нет. Введите существующий тип блюда.");
            }
        }

        if (combinations.isEmpty()) {
            cc.printlnRed("Вы не указали ни одного типа блюд");
            return;
        }

        dc.generateDishCombo(numberOfCombos, combinations);
    }
}
