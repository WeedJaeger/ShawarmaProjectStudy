package com.homework;

import java.util.*;

public class ChekpointTwo {
    // 1. menuLine
    static String menuLine(String dish, int price){
        return "%s — %d руб".formatted(dish, price);
    }

    // 2. orderTotal
    static int orderTotal(List<Integer> price){
        int totalSum = 0;
        for (Integer i : price) {
            totalSum += i;
        }
        return totalSum;
    }

    // 3. availableDishes
    static List<String> availableDishes (List<String> menu, Set<String> soldOut){
        //Долго думал, пробовал изменять входящий список, только потом допёр, что он неизменяемый и нужно работать с новым списком
        List<String> availableMenu = new ArrayList<>();
        for (String unit : menu) {
            boolean missDishes = soldOut.contains(unit);
            if (!missDishes){
                availableMenu.add(unit);
            }
        }
        return availableMenu;
    }

    // 4. countOrders
    static Map<String, Integer> countOrders (List<String> orders){
        Map<String, Integer> ordersDishes = new HashMap<>();
        for (String order : orders) {
            ordersDishes.put(order, ordersDishes.getOrDefault(order, 0) + 1);
        }
        return ordersDishes;
    }

    // 5. joinDishes
    static String joinDishes (List<String> dishes){
        if (dishes.isEmpty()){
            return "пусто";
        }
        return String.join(", ", dishes);
    }

    // 6. isOnMenu
    static boolean isOnMenu(List<String> menu, String dish) {
        boolean contains = false;
        for (String s : menu) {
            contains = dish.equalsIgnoreCase(s);
        }
        return contains;
    }

    public static void main(String[] args) {
        System.out.println(menuLine("Шаурма классическая", 250)); // Шаурма классическая — 250 руб
        System.out.println(orderTotal(List.of(250, 90, 250)));    // 590
        System.out.println(availableDishes(List.of("Шаурма", "Фалафель", "Кола"), Set.of("Фалафель")));                   // [Шаурма, Кола]
        System.out.println(countOrders(List.of("Шаурма",  "Кола", "Шаурма"))); // {Шаурма=2, Кола=1}
        System.out.println(joinDishes(List.of("Шаурма", "Фалафель", "Кола")));// Шаурма, Фалафель, Кола
        System.out.println(isOnMenu(List.of("Шаурма", "Кола"), "кола"));      // true
    }
}