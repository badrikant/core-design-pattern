package com.badri.patterns.creational.abstractfactory.xml;

import com.badri.patterns.creational.abstractfactory.Dao;
import com.badri.patterns.creational.abstractfactory.DaoAbstractFactory;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class XMLDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {

        Dao dao = null;
        if (type.equals("emp")) {
            dao = new XMLEmpDao();
        } else if (type.equals("dept"))
            dao = new XMLDeptDao();
        return dao;
    }
}
