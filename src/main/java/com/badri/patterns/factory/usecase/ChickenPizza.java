package com.badri.patterns.factory.usecase;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class ChickenPizza implements Pizza {

    public void prepare() {

        System.out.println("preparing chicken pizza");

    }

    public void bake() {

        System.out.println("baking chicken pizza");

    }

    public void cut() {

        System.out.println("cutting chicken pizza");

    }
}
