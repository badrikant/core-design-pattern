package com.badri.patterns.abstractfactory.xml;

import com.badri.patterns.abstractfactory.Dao;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class XMLDeptDao implements Dao {

    public void save() {
        System.out.println("Saving dept to XML");
    }
}
