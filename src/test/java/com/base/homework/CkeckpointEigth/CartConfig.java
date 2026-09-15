package com.base.homework.CkeckpointEigth;

import org.aeonbits.owner.Config;

public interface CartConfig extends Config {

    @Key("cart.default.size")
    @DefaultValue("3")
    int defaultSize();

    @Key("cart.max.size")
    @DefaultValue("20")
    int maxSize();
}
