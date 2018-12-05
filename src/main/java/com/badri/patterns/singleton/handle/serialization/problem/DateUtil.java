package com.badri.patterns.singleton.handle.serialization.problem;

import java.io.Serializable;

/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class DateUtil implements Serializable {

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


    // Should implement this method for fixing the serialization problem
    protected Object readResolve(){
        return instance;
    }
}
