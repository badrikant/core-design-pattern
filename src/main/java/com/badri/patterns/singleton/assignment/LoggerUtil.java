package com.badri.patterns.singleton.assignment;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class LoggerUtil implements Cloneable {

    private static volatile LoggerUtil instance;

    private LoggerUtil() {
    }

    public static LoggerUtil getInstance() {

        if (instance == null) {

            // thread safe
            synchronized (LoggerUtil.class) {
                if (instance == null) {
                    instance = new LoggerUtil();
                }
            }
        }
        return instance;
    }

    // print logs
    public void log(String message) {
        System.out.println(message);
    }


    // can't be cloned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
