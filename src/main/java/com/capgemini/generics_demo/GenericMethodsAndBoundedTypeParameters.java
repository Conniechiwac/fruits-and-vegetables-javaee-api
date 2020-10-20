package com.capgemini.generics_demo;

public class GenericMethodsAndBoundedTypeParameters {
    public static <E extends Comparable<E>> int countGreaterThan(E[] es, E e) {
        int count = 0;

        /*
         * il nous faut comparer avant de pouvoir faire appel aux opérateurs primitif (><=)
         */
        for (E element : es) {
            if (element.compareTo(e) > 0) {
                ++count;
            }
        }

        return count;
    }
}
