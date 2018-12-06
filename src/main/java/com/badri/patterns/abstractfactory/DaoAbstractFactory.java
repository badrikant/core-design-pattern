package com.badri.patterns.abstractfactory;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public abstract class DaoAbstractFactory {

    public abstract Dao createDao(String type);
}
