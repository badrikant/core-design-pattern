package com.badri.patterns.singleton.initialization.eager;

/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class DateUtil {

    private static DateUtil instance;

    //private static DateUtil instance = new DateUtil();

    static {

        instance = new DateUtil();
    }

    public static DateUtil getInstance() {
        return instance;
    }
}
