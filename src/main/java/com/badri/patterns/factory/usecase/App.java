package com.badri.patterns.factory.usecase;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class App {

    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore();
        ps.orderPizza("veggie");

    }
}
