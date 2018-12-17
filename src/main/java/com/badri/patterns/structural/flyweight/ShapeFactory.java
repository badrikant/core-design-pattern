package com.badri.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author badrikant.soni on 17/12/18,2018
 */
public class ShapeFactory {


    // caching the shapes
    private static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String type) {

        Shape shape = null;

        if (shapes.get(type) != null) {
            shape = shapes.get(type);
        } else {
            if (type.equals("circle")) {
                shape = new Circle();
            } else if (type.equals("rectangle")) {
                shape = new Rectangle();
            }
            shapes.put(type, shape);
        }
        return shape;
    }
}
