package com.capgemini.model;

public class Apple extends com.capgemini.model.TinySeeds {
    private com.capgemini.model.Color color;


    public Apple(int weight, com.capgemini.model.Color color) {
        super(weight);

        this.color = color;
    }

    public com.capgemini.model.Color getColor() {
        return color;
    }

    public void setColor(com.capgemini.model.Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nWeight: " + weight + "\n";
    }

    //TODO: Implement a comparator of Apple here

}
