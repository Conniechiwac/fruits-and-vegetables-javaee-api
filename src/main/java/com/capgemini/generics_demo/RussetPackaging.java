package com.capgemini.generics_demo;

import com.capgemini.model.Potato;
import com.capgemini.model.PotatoType;

public class RussetPackaging<T extends Potato> {
    private T t;

    public RussetPackaging(T t) {
        this.t = t;
    }

    public boolean isRusset() {
        return t.getType().equals(PotatoType.RUSSET);
    }
}
