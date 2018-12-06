package com.badri.patterns.creational.factory;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class VeggiePizza implements Pizza {

    public void prepare() {

        System.out.println("preparing veggie pizza");

    }

    public void bake() {

        System.out.println("baking veggie pizza");

    }

    public void cut() {

        System.out.println("cutting veggie pizza");

    }
}
