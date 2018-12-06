package com.badri.patterns.behavioural.templatemethod.csv;

import com.badri.patterns.behavioural.templatemethod.DataRenderer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class CSVDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Processed" + data;
    }
}
