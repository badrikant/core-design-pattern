package com.badri.patterns.structural.adapter;

/**
 * @author badrikant.soni on 07/12/18,2018
 */
public class WeatherUI {

    public static void showTemparature(int zipcode) {

        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemparature(zipcode));
    }

    public static void main(String[] args) {

        showTemparature(560103);

    }
}
