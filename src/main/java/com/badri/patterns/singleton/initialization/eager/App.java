package com.badri.patterns.singleton.initialization.eager;
/**
 * @author badrikant.soni on 03/12/18,2018
 */
public class App {

    public static void main(String[] args) {

        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();


        // checking if both are pointing to same object in memory
        System.out.println(dateUtil1==dateUtil2); // true
    }
}
