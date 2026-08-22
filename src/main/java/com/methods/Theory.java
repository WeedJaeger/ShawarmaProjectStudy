package com.methods;

public class Theory {
    public static void main(String[] args) {
        String message = "вызов из мейна";
        logStep(message);

        String orderUrl = buildUrl("https://google.com", 50);
        System.out.println(orderUrl);

        String prod = getUrlFromEnv("PROD");
        System.out.println(prod);
    }

    public static void logStep(String message){
        System.out.println("Логируем шаг: " + message);
    }

    public static String buildUrl (String baseUrl, int orderId){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseUrl);
        stringBuilder.append("/api/orders/");
        stringBuilder.append(orderId);
        String result = stringBuilder.toString();
        return result;
    }

    public static String getUrlFromEnv (String env) {
        String baseUrl = switch (env) {
            case "LOCAL" -> "localhost:8080";
            case "PROD" -> "google.com";
            case "STAGE" -> "yandex.ru";
            default -> "Unknown";
        };
        return baseUrl;
    }
}
