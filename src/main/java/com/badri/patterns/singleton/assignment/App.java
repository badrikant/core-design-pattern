package com.badri.patterns.singleton.assignment;

/**
 * @author badrikant.soni on 05/12/18,2018
 */
public class App {

    public static void main(String[] args) {
        
        LoggerUtil loggerUtil = LoggerUtil.getInstance();
        loggerUtil.log("I am from singleton logger class");
    }
}
