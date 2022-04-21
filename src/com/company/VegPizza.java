package com.company;

public class VegPizza extends Pizza {
    @Override
    void preparePizzaBase() {
        System.out.println("Pregătirea bazei de pizza pentru Pizza Vegana");
    }

    @Override
    void addToppings() {
        System.out.println("Adăugarea de toppinguri pentru Pizza Vegana");
    }

    @Override
    void bakePizza() {
        System.out.println("Coacerea Vegan Pizza");
    }
}