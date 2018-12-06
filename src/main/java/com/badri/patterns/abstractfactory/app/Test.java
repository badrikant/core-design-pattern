package com.badri.patterns.abstractfactory.app;

import com.badri.patterns.abstractfactory.Dao;
import com.badri.patterns.abstractfactory.DaoAbstractFactory;
import com.badri.patterns.abstractfactory.producer.DaoFactoryProducer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class Test {

    public static void main(String[] args) {

        DaoAbstractFactory daf1 = DaoFactoryProducer.produce("xml");
        Dao dao1 = daf1.createDao("emp");
        Dao dao2 = daf1.createDao("dept");
        dao1.save();
        dao2.save();

        DaoAbstractFactory daf2 = DaoFactoryProducer.produce("db");
        Dao dao3 = daf2.createDao("emp");
        Dao dao4 = daf2.createDao("dept");
        dao3.save();
        dao4.save();

    }
}
