package com.badri.patterns.creational.abstractfactory.db;

import com.badri.patterns.creational.abstractfactory.Dao;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class DBDeptDao implements Dao {

    public void save() {
        System.out.println("Saving dept to DB");
    }
}
