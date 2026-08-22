package com.strings;

public class Theory {
    public static void main(String[] args) {
        String actual = "NEW";
        String expected = "NEW";

        System.out.println(actual.equals(expected));
        System.out.println("admin".equalsIgnoreCase("ADMIN"));

        String url = "http://localhost:8080/api/orders/42";
        System.out.println(url.contains("OLEG"));

        url = url.toUpperCase();
        System.out.println(url);

        int length = url.length();
        System.out.println(length);

        String status = null;
        "PAID".equals(status);   // не упадёт, даже если status == null
        status.equals("PAID");   // упадёт с NPE, если status == null
    }
}
