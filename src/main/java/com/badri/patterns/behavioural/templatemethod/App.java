package com.badri.patterns.behavioural.templatemethod;

import com.badri.patterns.behavioural.templatemethod.csv.CSVDataRenderer;
import com.badri.patterns.behavioural.templatemethod.xml.XMLDataRenderer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class App {

    public static void main(String[] args) {

        DataRenderer dataRendererXML = new XMLDataRenderer();
        dataRendererXML.render();

        DataRenderer dataRendererCSV = new CSVDataRenderer();
        dataRendererCSV.render();

    }
}
