package lesson2.impl;

import lesson2.Figure;
import lesson2.FigureNames;

public class SquareShape implements Figure{
    private final float a;

    public SquareShape(float a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return FigureNames.SQUARE.getName();
    }

    @Override
    public float getPerimeter() {
        return a * 4;
    }

    @Override
    public float getSquare() {
        return a * a;
    }
}
