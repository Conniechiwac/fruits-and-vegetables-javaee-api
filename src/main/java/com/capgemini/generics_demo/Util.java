package com.capgemini.generics_demo;

public class Util {
    public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        return (p1.getK().equals(p2.getK()) && p1.getV().equals(p2.getV()));
    }
}
