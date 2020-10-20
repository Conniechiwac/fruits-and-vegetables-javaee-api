package com.capgemini.model.russet_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class NorkotahRusset extends Potato {
    public NorkotahRusset(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
