package com.operators;

public class TernaryExample {
    public static void main(String[] args) {
        String env = "PROD";
        String baseUrl = env.equals("PROD") ? "google.com" : "yandex.ru";
        System.out.println(baseUrl);
    }
}
