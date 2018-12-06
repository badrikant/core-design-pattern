package com.badri.patterns.creational.abstractfactory.db;

import com.badri.patterns.creational.abstractfactory.Dao;
import com.badri.patterns.creational.abstractfactory.DaoAbstractFactory;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {

        Dao dao = null;
        if (type.equals("emp")) {
            dao = new DBEmpDao();
        } else if (type.equals("dept"))
            dao = new DBDeptDao();
        return dao;
    }
}
