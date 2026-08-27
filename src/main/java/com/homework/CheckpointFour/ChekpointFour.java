package com.homework.CheckpointFour;

import com.enums.PaymentChoice;

public class ChekpointFour {
    public static void main(String[] args) {
        runCase(0, RecipeSize.M, 2, PaymentsChoice.CARD);
        runCase(42, null, 2, PaymentsChoice.CARD);
        runCase(42, RecipeSize.L, 15, PaymentsChoice.CARD);
        runCase(42, RecipeSize.L, 2, null);
        runCase(42, RecipeSize.L, 5, PaymentsChoice.CASH);
        runCase(42, RecipeSize.L, 2, PaymentsChoice.CARD);
    }

    public static void runCase(long recipeId, RecipeSize size, int qty, PaymentsChoice payment){
        try {
            int price = OrderValidator.validateAndPrice(recipeId, size, qty,payment);
            System.out.println("[OK] price=" + price);
        } catch (OrderValidationtException e){
            System.out.println("[REJECT] " + e.getMessage());
        }
    }
}
