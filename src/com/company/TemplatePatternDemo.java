package com.company;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new VegPizza();
        pizza.preparePizza();
        System.out.println();
        pizza = new ChickenPizza();
        pizza.preparePizza();
    }
}
