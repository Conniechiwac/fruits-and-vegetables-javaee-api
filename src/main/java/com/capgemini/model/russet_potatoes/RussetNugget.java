package com.capgemini.model.russet_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class RussetNugget extends Potato {
    public RussetNugget(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
