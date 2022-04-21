package com.company;

public class ChickenPizza extends Pizza {
    @Override
    void preparePizzaBase() {
        System.out.println("Pregatirea bazei de pizza pentru Chicken Pizza");
    }

    @Override
    void addToppings() {
        System.out.println("Adăugarea de topping-uri pentru Chicken Pizza");
    }

    @Override
    void bakePizza() {
        System.out.println("Coacerea Chicken Pizza");
    }
}