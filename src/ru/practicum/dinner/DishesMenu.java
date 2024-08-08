package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class DishesMenu {
    ConsoleColor cc = new ConsoleColor();
    private final HashMap<String, ArrayList<String>> dishesMenu = new HashMap<>();

    public HashMap<String, ArrayList<String>> getMenu() {
        return dishesMenu;
    }

    void addNewDish(String dishType, String dishName) {
        ArrayList<String> dishCategory;

        for (String dishTypeName : dishesMenu.keySet()) {
            if (dishTypeName.equals(dishType)) {
                dishCategory = dishesMenu.get(dishType);
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
        dishesMenu.put(dishType, dishCategory);
    }

    ArrayList<String> getDishesInType(String dishType) {
        for (String dishTypeName : dishesMenu.keySet()) {
            if (dishTypeName.equalsIgnoreCase(dishType)) {
                return dishesMenu.get(dishTypeName);
            }
        }
        return null;
    }
}
