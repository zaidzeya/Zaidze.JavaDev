package lesson2.impl;

import lesson2.Figure;
import lesson2.FigureNames;

public class TriangleShape implements Figure {
    private final float a;
    private final float b;
    private final float c;

    public TriangleShape(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getType() {
        return FigureNames.TRIANGLE.getName();
    }

    @Override
    public float getPerimeter() {
        float p = a + b + c;
        return p;
    }

    @Override
    public float getSquare() {
        float semip = (a + b + c)/2;
        return (float) Math.sqrt(semip * (semip - a) * (semip - b) * (semip - c));
    }


}
