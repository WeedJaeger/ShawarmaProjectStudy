package com.base.homework.CkeckpointEigth;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionsEight {

    @Test
    public void configReturnsDefaults(){
        CartConfig config = ConfigFactory.create(CartConfig.class);
        assertThat(config.defaultSize()).isEqualTo(3);
        assertThat(config.maxSize()).isEqualTo(20);
    }

    @Test
    public void factoryCreatesCartOfDefaultSize(){
        CartConfig config = ConfigFactory.create(CartConfig.class);
        Cart cart = CartFactory.newCart(config.defaultSize());

        assertThat(cart.getUserId()).isPositive();
        assertThat(cart.getItems()).hasSize(config.defaultSize());

        assertThat(cart.getItems()).allSatisfy(item -> {
            assertThat(item.getDish()).isNotBlank();
            assertThat(item.getQuantity()).isBetween(1,4);
            assertThat(item.getPrice()).isBetween(100, 1000);
        });
    }

    @Test
    public void factoryRespectExplicitSize(){
        Cart cart = CartFactory.newCart(7);
        assertThat(cart.getItems()).hasSize(7);
        System.out.println(cart);
    }
}
