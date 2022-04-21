package com.company;

public abstract class Pizza {
    abstract void preparePizzaBase();
    abstract void addToppings();
    abstract void bakePizza();


    public final void preparePizza(){

        preparePizzaBase();

        addToppings();

        bakePizza();
    }
}