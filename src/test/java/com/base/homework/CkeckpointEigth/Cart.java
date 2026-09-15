package com.base.homework.CkeckpointEigth;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {
    private final long userId;
    private final List<Item> items = new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }

    @Data
    @AllArgsConstructor
    static class Item{
        private String dish;
        private int quantity;
        private int price;
    }
}
