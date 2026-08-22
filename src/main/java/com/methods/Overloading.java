package com.methods;

public class Overloading {
    public static void main(String[] args) {
        String baseUrl = "http:localhost:8080";
        String s1 = buildUrl(baseUrl, "/api/orders/");
        String s2 = buildUrl(baseUrl, "/api/orders", 10);
        String s3 = buildUrl(baseUrl, "/api/orders", "SORT=ACK");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static String buildUrl (String baseUrl, String path){
        return baseUrl + path;
    }

    public static String buildUrl (String baseUrl, String path, int id) {
        return baseUrl + path + "/" + id;
    }

    public static String buildUrl (String baseUrl, String path, String querryParam) {
        return baseUrl + path + "?" + querryParam;
    }
}
