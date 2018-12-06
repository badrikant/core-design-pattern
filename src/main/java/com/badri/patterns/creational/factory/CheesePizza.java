package com.badri.patterns.creational.factory;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class CheesePizza implements Pizza {

    public void prepare() {

        System.out.println("preparing cheese pizza");

    }

    public void bake() {

        System.out.println("baking cheese pizza");

    }

    public void cut() {

        System.out.println("cutting cheese pizza");

    }
}
