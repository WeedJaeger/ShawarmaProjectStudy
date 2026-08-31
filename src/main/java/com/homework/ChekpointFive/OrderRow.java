package com.homework.ChekpointFive;

public class OrderRow {
    private final long id;
    private final String customer;
    private final OrderStatus status;
    private final PaymentChoice paymentChoice;
    private final double total;

    public OrderRow(long id, String customer, OrderStatus status, PaymentChoice paymentChoice, double total) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.paymentChoice = paymentChoice;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public PaymentChoice getPaymentChoice() {
        return paymentChoice;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "OrderRow{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", status=" + status +
                ", paymentChoice=" + paymentChoice +
                ", total=" + total +
                '}';
    }
}
