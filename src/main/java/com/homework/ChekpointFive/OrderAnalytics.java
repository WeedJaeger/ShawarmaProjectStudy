package com.homework.ChekpointFive;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderAnalytics {
    static List<OrderRow> paidByCustomer(List<OrderRow> orders, String customer){
        List<OrderRow> list = orders.stream()
                .filter(x -> x.getCustomer()
                        .equals(customer))
                .filter(x -> x.getStatus()
                        .equals(OrderStatus.PAID))
                .toList();
        return list;
    }

    static double revenue(List<OrderRow> orders){
        double sum = orders.stream()
                .filter(x -> !x.getStatus()
                        .equals(OrderStatus.CANCELLED))
                .mapToDouble(OrderRow::getTotal)
                .sum();
        return sum;
    }

    static Map<OrderStatus, Long> countByStatus(List<OrderRow> orders){
        Map<OrderStatus, Long> collect = orders.stream()
                .collect(Collectors.groupingBy(OrderRow::getStatus, Collectors.counting()));
        return collect;
    }

    static Map<PaymentChoice, Double> revenueByPayment(List<OrderRow> orders){
        Map<PaymentChoice, Double> collect = orders.stream()
                .filter(x -> !x.getStatus()
                        .equals(OrderStatus.CANCELLED))
                .collect(Collectors.groupingBy(OrderRow::getPaymentChoice, Collectors.summingDouble(OrderRow::getTotal)));
        return collect;
    }

    static Page<OrderRow> page(List<OrderRow> orders, int pageNum, int pageSize){
        List<OrderRow> items = orders.stream().skip((long) (pageNum - 1) * pageSize).limit(pageSize).toList();
        return new Page<>(items,pageNum,pageSize, orders.size());
    }


}
