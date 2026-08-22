package com.oop_basics;

public class Theory {
    public static void main(String[] args) {
        OrderResponse orderResponse = new OrderResponse();

        System.out.println(orderResponse);
        System.out.println(orderResponse.getStatus());

        OrderResponse orderResponse1 = new OrderResponse(5,"DONE",99.99,10);
        System.out.println(orderResponse1.getId());

        orderResponse.summary();
        orderResponse1.summary();
        orderResponse.addDiscount(50);
        System.out.println(orderResponse.getPrice());
    }
}
