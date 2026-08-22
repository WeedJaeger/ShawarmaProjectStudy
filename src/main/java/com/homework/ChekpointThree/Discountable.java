package com.homework.ChekpointThree;

public interface Discountable {
    int discountPercent();

    default int applyDiscount(int ammount){
        return ammount - ammount * discountPercent()/100;
    }
}
