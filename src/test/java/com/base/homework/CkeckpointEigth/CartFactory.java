package com.base.homework.CkeckpointEigth;

import net.datafaker.Faker;

public class CartFactory {
    private final static Faker faker = new Faker();

    static Cart newCart(int size){
        Cart cart = new Cart(faker.number().numberBetween(1, 50));

        for (int i = 0; i < size; i++) {
            Cart.Item item = new Cart.Item(
                    faker.food().dish(),
                    faker.number().numberBetween(1,4),
                    faker.number().numberBetween(100, 1000));
            cart.addItem(item);
        }
        return cart;
    }
}
