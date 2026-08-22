package com.collection;

import java.util.*;

public class Theory {
    public static void main(String[] args) {
        List<String> browsers = new ArrayList<>();
        browsers.add("chrome");
        browsers.add("firefox");
        browsers.add("edge");


        int size = browsers.size();
        boolean safari = browsers.contains("safari");
        System.out.println(size);
        System.out.println(safari);

        for (String browser : browsers) {
            System.out.println(browser);
        }


        for (int i = 0; i < size; i++) {
            String currentBrowser = browsers.get(i);
            System.out.println(currentBrowser );
        }

        Map<String, String> cars = new HashMap<>();
        cars.put("Kia", "GREEN");
        cars.put("Kia", "YELLOW");
        cars.put("NISSAN", "BLACK");

        System.out.println(cars.size());
        System.out.println(cars.get("Kia"));

        for (Map.Entry<String, String> stringStringEntry : cars.entrySet()) {
            stringStringEntry.getKey();
            stringStringEntry.getValue();
        }

        Set<String> colors = new HashSet<>();
        colors.add("GREEN");
        colors.add("BLACK");
        colors.add("GREEN");

        System.out.println(colors);
    }
}
