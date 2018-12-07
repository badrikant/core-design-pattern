package com.badri.patterns.structural.adapter;

/**
 * @author badrikant.soni on 07/12/18,2018
 */
public class WeatherAdapter {

    public int findTemparature(int zipcode) {
        String city = null;

        if (zipcode == 560103) {
            city = "Bangalore";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temparature = finder.find(city);

        return temparature;
    }
}
