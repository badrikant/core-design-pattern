package com.badri.patterns.structural.flyweight;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class Rectangle extends Shape {

    private String label;

    public void draw(int length, int breadth, String fillStyle) {

        System.out.println(
                "drawing a " + label + " with length " + length + " Breadth " + breadth + " Fill Style " + fillStyle
        );
    }

    public Rectangle() {
        this.label = "Rectangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
