package com.homework;

public class Chekpoint {
    public static void main(String[] args) {

        // Входные данные
        String dish = "SHAWARMA_XL";
        int qty = 2;
        int minutesToClose = 18;

        // 1. unitPrice
        int unitPrice = switch (dish){
            case "SHAWARMA_CLASSIC" -> 220;
            case "SHAWARMA_XL" -> 320;
            case "FALAFEL" -> 180;
            case "DRINK" -> 90;
            default -> 0;
        };

        // 2. subtotal
        int subtotal = qty * unitPrice;

        // 3. discountPercent
        int discountPercent;
        if (subtotal >= 2000){
            discountPercent = 15;
        } else if (subtotal >= 1000) {
            discountPercent = 10;
        } else if (subtotal >= 500) {
            discountPercent = 5;
        } else {
            discountPercent = 0;
        }

        // 4. total
        int total = subtotal - subtotal * discountPercent / 100;

        // 5. batch
        String batch = qty <= 1 ? "single" : qty <= 5 ? "small batch" : "big batch";

        // 6. kitchenAction
        String kitchenAction = null;
        if (minutesToClose <= 0){
            System.out.println("Кухня закрыта - уходите ЪуЪ");
        } else {
            kitchenAction = switch (dish){
                case "SHAWARMA_CLASSIC" -> "grill " + 4 * qty + " min";
                case "SHAWARMA_XL" -> "grill " + 7 * qty + " min";
                case "FALAFEL" -> "fry " + 5 * qty + " min";
                case "DRINK" -> "pour & serve";
                default -> "manual check";
            };
        }

        // 7. печать чека
        System.out.println("[ORDER] " + dish + " x" + qty);
        System.out.println("[PRICE] " + subtotal + " -> " + total + " (" + "-" + discountPercent + "%)");
        System.out.println("[BATCH] " + batch);
        System.out.println("[KITCHEN] " + kitchenAction);
        System.out.println("[CLOSE] " + minutesToClose + " min left");
    }
}
