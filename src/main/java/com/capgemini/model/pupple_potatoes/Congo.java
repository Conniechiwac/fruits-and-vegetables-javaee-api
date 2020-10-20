package com.capgemini.model.pupple_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class Congo extends Potato {
    public Congo(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
