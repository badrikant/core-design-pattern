package com.badri.patterns.singleton.handle.multithread;

/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class DateUtil {

    private static volatile DateUtil instance;

    private DateUtil() {
        // no other class create object directly
    }

    public static DateUtil getInstance() {

        if (instance == null) { // since acquiring the class is expensive operation for evey calls, hence check if instance is created already
            synchronized (DateUtil.class) {
                if (instance == null) {  // create object if its not already created
                    instance = new DateUtil();
                }

            }
        }
        return instance;
    }
}
