package com.capgemini.model.pupple_potatoes;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class PurplePeruvian extends Potato {
    public PurplePeruvian(double weight, PotatoType type) {
        super(weight, type);
    }

    public PurplePeruvian(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
