package com.homework.ChekpointThree;

public class Shawarma extends MenuItem{

    private final boolean xl;

    public Shawarma(String name, int basePrice, boolean xl) {
        super(name, basePrice);
        this.xl = xl;
    }

    @Override
    int price() {
        if (!xl){
            return basePrice;
        } else {
            return basePrice + 100;
        }
    }

    @Override
    String kind() {
        return "Шаурма";
    }
}
