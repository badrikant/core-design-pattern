package com.badri.patterns.structural.flyweight;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class PaintApp {

    public void render(int numberOfShapes) {

        Shape shape[] = new Shape[numberOfShapes + 1];

        for (int i = 1; i <= numberOfShapes; i++) {
            if (i % 2 == 0) {
                shape[i] = new Circle();  // problem : its creating many objects here which is consuming considerable amount of memory.
                ((Circle) shape[i]).setRadius(i);
                ((Circle) shape[i]).setLineColor("red");
                ((Circle) shape[i]).setFillColor("white");
                shape[i].draw();
            } else {

                // problem : its creating many objects here which is consuming considerable amount of memory.
                shape[i] = new Rectangle();
                ((Rectangle) shape[i]).setLength(i);
                ((Rectangle) shape[i]).setBreadth(i + i);
                ((Rectangle) shape[i]).setFillStyle("dotted");
                shape[i].draw();

            }
        }
    }
}
