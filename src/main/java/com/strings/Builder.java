package com.strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://localhost:8080");
        sb.append("/api");
        sb.append("/orders");
        sb.append("/").append(42);

        String url = sb.toString();
        System.out.println(url);
    }
}
