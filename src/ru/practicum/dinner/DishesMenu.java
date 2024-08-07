package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class DishesMenu {
    ConsoleColor cc = new ConsoleColor();
    private final HashMap<String, ArrayList<String>> DISHES_MENU = new HashMap<>();

    public HashMap<String, ArrayList<String>> getMenu() {
        return DISHES_MENU;
    }

    void addNewDish(String dishType, String dishName) {
        ArrayList<String> dishCategory;

        for (String dishTypeName : DISHES_MENU.keySet()) {
            if (dishTypeName.equals(dishType)) {
                dishCategory = DISHES_MENU.get(dishType);
                if (!dishCategory.contains(dishName)) {
                    dishCategory.add(dishName);
                    cc.printlnGreen("Блюдо добавлено.");
                } else {
                    cc.printlnGreen("Блюдо уже имеется в категории.");
                }
                return;
            }
        }

        dishCategory = new ArrayList<>();
        dishCategory.add(dishName);
        DISHES_MENU.put(dishType, dishCategory);
    }

    ArrayList<String> getDishesInType(String dishType) {
        for (String dishTypeName : DISHES_MENU.keySet()) {
            if (dishTypeName.equalsIgnoreCase(dishType)) {
                return DISHES_MENU.get(dishTypeName);
            }
        }
        return null;
    }
}
