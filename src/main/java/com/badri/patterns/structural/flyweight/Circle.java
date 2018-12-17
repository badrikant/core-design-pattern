package com.badri.patterns.structural.flyweight;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class Circle extends Shape {

    private String label;


    public void draw(int radius, String fillColor, String lineColor) {

        System.out.println("Drawing a " + label + " with radius : " + radius + " Fill Color : " + fillColor + " line Color : " + lineColor);
    }

    public Circle() {
        this.label = "Circle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}