package com.badri.patterns.structural.flyweight;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class Rectangle implements Shape {

    private String label;
    private int length;
    private String fillStyle;
    private int breadth;

    public void draw() {

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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
