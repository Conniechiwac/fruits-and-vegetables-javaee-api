package com.capgemini.model.pupple_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class AllBlue extends Potato {
    public AllBlue(double weight, PotatoType type) {
        super(weight, type);
    }

    public AllBlue(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
