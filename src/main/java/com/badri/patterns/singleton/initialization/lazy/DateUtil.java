package com.badri.patterns.singleton.initialization.lazy;

/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class DateUtil {

    private static DateUtil instance;

    private DateUtil() {
        // no other class create object directly
    }

    public static DateUtil getInstance() {
        if (instance == null) {  // create object if its not already created
            instance = new DateUtil();
        }
        return instance;
    }
}
