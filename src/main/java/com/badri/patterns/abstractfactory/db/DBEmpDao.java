package com.badri.patterns.abstractfactory.db;

import com.badri.patterns.abstractfactory.Dao;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class DBEmpDao implements Dao {

    public void save() {
        System.out.println("Saving employee to DB");
    }
}
