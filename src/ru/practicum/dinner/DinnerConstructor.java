package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {
    Random random = new Random();
    ConsoleColor cc = new ConsoleColor();
    DishesMenu dishesMenu = new DishesMenu();

    void addNewDish(String dishType, String dishName) {
        dishesMenu.addNewDish(dishType, dishName);
    }

    void generateDishCombo(int numberOfCombos, ArrayList<String> combinations) {
        for (int i = 1; i <= numberOfCombos; i++) {
            cc.printlnBlue("Комбо " + i);
            ArrayList<String> dishesCombo = new ArrayList<>();
            for (String combination : combinations) {
                ArrayList<String> dishesInType = dishesMenu.getDishesInType(combination);
                int randomDishIndex = random.nextInt(dishesInType.size());
                dishesCombo.add(dishesInType.get(randomDishIndex));
            }
            cc.printlnGreen(dishesCombo);
        }
    }

    boolean checkType(String dishType){
        for (String dishTypeName : dishesMenu.getMenu().keySet()) {
            if (dishTypeName.equalsIgnoreCase(dishType)) {
                return true;
            }
        }
        return false;
    }
}
