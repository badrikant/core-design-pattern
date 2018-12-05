package com.badri.patterns.factory.usecase;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
