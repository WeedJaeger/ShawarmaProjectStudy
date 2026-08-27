package com.homework.CheckpointFour;

public class OrderValidationtException extends RuntimeException {
    public OrderValidationtException(String message) {
        super("OrderValidation: " +  message);
    }
}
