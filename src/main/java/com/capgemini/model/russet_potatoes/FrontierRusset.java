package com.capgemini.model.russet_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class FrontierRusset extends Potato {
    public FrontierRusset(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
