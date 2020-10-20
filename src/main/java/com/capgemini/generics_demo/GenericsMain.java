package com.capgemini.generics_demo;

import com.capgemini.model.Apple;
import com.capgemini.model.Color;
import com.capgemini.model.Potato;
import com.capgemini.model.pupple_potatoes.Congo;
import com.capgemini.model.russet_potatoes.RussetNugget;

public class GenericsMain {
    public static void main(String[] args) {
        Packaging<Integer> integerPackaging = new Packaging<>();
        integerPackaging.set(10);
        integerPackaging.inspect(new Apple(14, Color.RED));

        Packaging<Potato> potatoPackaging = new Packaging<>();
        potatoPackaging.set(new Congo(12.5));
        RussetPackaging<Potato> russetPackaging = new RussetPackaging<>(new Congo(12.5));
        russetPackaging.isRusset();
        System.out.println("Congo: " + russetPackaging.isRusset());

        RussetPackaging<Potato> russetPackaging1 = new RussetPackaging<>(new RussetNugget(14.4));
        System.out.println("RussetNugget: " + russetPackaging1.isRusset());

        Potato[] potatoes = {
                new Congo(12.2),
                new RussetNugget(14.4),
                new RussetNugget(16.8)
        };

        Integer[] chiffres = {1, 14, 2, 80, 20, 95};
        System.out.println(GenericMethodsAndBoundedTypeParameters.countGreaterThan(chiffres, 20));

        //GenericMethodsAndBoundedTypeParameters.countGreaterThan(potatoes, new RussetNugget(40.0));
    }
}





/*
            Packaging<Fruit> packaging = new Packaging<>();
            packaging.set(new Apple(4, Color.PINK));
            packaging.set(new Apple(14, Color.GREEN));

            // Packaging<String> stringPackaging = new Packaging<>();

            // Pair<Integer, Apple> p1 = new Pair<>(1, new Apple(4, Color.PINK));
            // Pair<Integer, Apple> p2 = new Pair<>(1, new Apple(4, Color.PINK));
            // => false

            // Pair<Integer, String> p1 = new Pair<>(1, "apple");
            // Pair<Integer, String> p2 = new Pair<>(1, "apple");
            // => true

           boolean same = Util.compare(p1, p2);

           System.out.println(same);
*/
