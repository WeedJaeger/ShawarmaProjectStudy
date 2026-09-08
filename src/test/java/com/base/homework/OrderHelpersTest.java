package com.base.homework;
import com.homework.CheckpointSix.OrderHelpers;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderHelpersTest {

    @Test
    public void formatBuildHumanString(){
        String paid = OrderHelpers.format(42, "PAID", 199.0);
        assertThat(paid).as("Проверка строки заказа").isEqualTo("Order #" + 42 + " | " + "PAID" + " | " + 199.0);
    }

    @Test
    public void finalForPaidNotForCreated(){
        boolean paid = OrderHelpers.isFinal("PAID");
        boolean created = OrderHelpers.isFinal("CREATED");
        assertThat(paid).isTrue();
        assertThat(created).isFalse();
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "CREATED, false",
            "PAID, true",
            "READY, true",
            "COMPLETED, true",
            "UNKNOWN, false"
    })
    public void finalStatusTable(String status, boolean expected){
        assertThat(OrderHelpers.isFinal(status)).isEqualTo(expected);
    }

    @Test
    public void keepFinalFilterOnlyFinalStatuses(){
        List<String> result = List.of("CREATED","PAID","READY","CANCELLED");
        assertThat(result)
                .hasSize(3)
                .contains("PAID", "READY")
                .doesNotContain("CREATED");
    }
}
