package org.stubbingExcersise;

public class RectangleStatistics {

    public int calculateArea(Rectangle rectangle){

        return rectangle.getWidth() * rectangle.getLength();
    }

    public int calculateCircumference(Rectangle rectangle){

        return (rectangle.getWidth() + rectangle.getLength()) * 2;
    }
}
