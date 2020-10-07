package lesson2.impl;

import lesson2.Figure;
import lesson2.FigureNames;

public class RectangleShape implements Figure {
    private final float a;
    private final float b;

    public RectangleShape(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return FigureNames.RECTANGLE.getName();
    }

    @Override
    public float getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public float getSquare() {
        return a * b;
    }
}
