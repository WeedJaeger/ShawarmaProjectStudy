package com.strings;

public class MethodExamples {
    public static void main(String[] args) {
        String googleCode = "GOOGLE-4813";
        String onlynumbers = googleCode.substring(7);
        System.out.println(onlynumbers);
        int parseNumber = Integer.parseInt(onlynumbers);
        System.out.println(parseNumber + 10);

        String regex = googleCode.replaceAll("\\d+", "");
        System.out.println(regex);

        googleCode = null;
        boolean empty = googleCode.isEmpty();
        System.out.println(empty);
    }
}
