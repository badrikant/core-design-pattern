package com.badri.patterns.factory.usecase.assigment;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class App {

    public static void main(String[] args) {

        Person p = PersonFactory.createPerson("Female");
        p.wish("I wish I could go to world tour");

    }
}
