package com.badri.patterns.behavioural.templatemethod.xml;

import com.badri.patterns.behavioural.templatemethod.DataRenderer;

/**
 * @author badrikant.soni on 06/12/18,2018
 */
public class XMLDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "Processed" + data;
    }
}
