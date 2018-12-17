package com.badri.patterns.creational.abstractfactory.producer;

import com.badri.patterns.creational.abstractfactory.DaoAbstractFactory;
import com.badri.patterns.creational.abstractfactory.db.DBDaoFactory;
import com.badri.patterns.creational.abstractfactory.xml.XMLDaoFactory;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;

        if (factoryType.equals("xml")) {
            daf = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            daf = new DBDaoFactory();
        }
        return daf;
    }
}