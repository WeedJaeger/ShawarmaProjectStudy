package com.homework.CheckpointFour;

public class OrderValidator {
    static int validateAndPrice(long recipeId, RecipeSize size, int qty, PaymentsChoice payment){

        if (recipeId <= 0){
            throw new OrderValidationtException("recipeId must be positive");
        }
        if (size == null){
            throw new OrderValidationtException("size is required");
        }
        if (qty < 1 || qty > 10){
            throw new OrderValidationtException("qty must be between 1 and 10");
        }
        if (payment == null){
            throw new OrderValidationtException("payment is required");
        }

        int total = size.getBasePrice() * qty;

        if (total > 1000 && !payment.isOnline()){
            throw new OrderValidationtException("cash not allowed for orders over 1000");
        }
        return total;
    }
}
