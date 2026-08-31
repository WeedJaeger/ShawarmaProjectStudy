package com.homework.ChekpointFive;

import java.util.List;

public class ChekpointFive {
    public static void main(String[] args) {
        List<OrderRow> orders = List.of(
                new OrderRow(1,"Alice", OrderStatus.PAID, PaymentChoice.CARD, 320),
                new OrderRow(2,"Bob", OrderStatus.CANCELLED, PaymentChoice.CASH, 567),
                new OrderRow(3,"Jaba", OrderStatus.COMPLETED, PaymentChoice.CRYPTO, 99),
                new OrderRow(4,"Alice", OrderStatus.PAID, PaymentChoice.CARD, 777),
                new OrderRow(5,"Bro", OrderStatus.PREPARING, PaymentChoice.CARD, 1421),
                new OrderRow(6,"CoolBro", OrderStatus.READY, PaymentChoice.CASH, 228),
                new OrderRow(7,"Steve", OrderStatus.COMPLETED, PaymentChoice.CARD, 4221),
                new OrderRow(8,"Jaba", OrderStatus.READY, PaymentChoice.CRYPTO, 5),
                new OrderRow(9,"Bob", OrderStatus.CREATED, PaymentChoice.CRYPTO, 934),
                new OrderRow(10,"Serafim", OrderStatus.CANCELLED, PaymentChoice.CASH, 100)
        );

        OrderAnalytics.paidByCustomer(orders, "Alice").forEach(System.out::println);

        System.out.println(OrderAnalytics.revenue(orders));

        System.out.println(OrderAnalytics.countByStatus(orders));

        System.out.println(OrderAnalytics.revenueByPayment(orders));

        System.out.println(OrderAnalytics.page(orders,2,4));
    }
}
