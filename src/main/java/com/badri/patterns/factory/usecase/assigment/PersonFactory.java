package com.badri.patterns.factory.usecase.assigment;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class PersonFactory {

    public static Person createPerson(String Type){

        Person p = null;

        if(Type.equals("Male")){
            p = new Male();
        }else{
            p = new Female();
        }
        return p;
    }
}
