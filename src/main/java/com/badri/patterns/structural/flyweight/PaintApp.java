package com.badri.patterns.structural.flyweight;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class PaintApp {

    public void render(int numberOfShapes) {


        Shape shape = null;

        for (int i = 1; i <= numberOfShapes; i++) {
            if (i % 2 == 0) {

                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red", "white");

            } else {

                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, i + i, "dotted");

            }
        }
    }
}
