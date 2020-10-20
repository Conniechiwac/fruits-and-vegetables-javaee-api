package com.capgemini.generics_demo;

import com.capgemini.model.Fruit;

/*
 * any Class type;
 * any Interface;
 * any array type;
 */
public class Packaging<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }

    public <U extends Fruit> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

}
