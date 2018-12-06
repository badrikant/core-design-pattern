package com.badri.patterns.behavioural.templatemethod;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public abstract class DataRenderer {

    public void render() {

        String data = readData();
        String processData = processData(data);
        System.out.println(processData);

    }

    public abstract String readData();

    public abstract String processData(String data);

}
