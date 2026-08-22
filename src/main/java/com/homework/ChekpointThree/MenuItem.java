package com.homework.ChekpointThree;

public abstract class MenuItem {
     protected final String name;
     protected final int basePrice;

    public MenuItem (String name, int basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    void printReceipt(){
        System.out.println("[" + kind() + "] " + name + " — " + price() + " руб.");
    }

    abstract int price();
    abstract String kind();

    //--------------------------------------------

    public static void main(String[] args) {
        Shawarma classic = new Shawarma("Классическая", 250, false);
        Shawarma xl = new Shawarma("XL", 250, true);
        Drink cola = new Drink("Кола", 90);
        Combo combo = new Combo("Шаурма + Кола", 320);

        classic.printReceipt();
        xl.printReceipt();
        cola.printReceipt();
        combo.printReceipt();

        System.out.println("[СКИДКА] " + combo.discountPercent() + "% → " + combo.applyDiscount(combo.price()) + " руб.");
    }
}

