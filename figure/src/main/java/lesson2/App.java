package lesson2;

import lesson2.impl.RectangleShape;
import lesson2.impl.SquareShape;
import lesson2.impl.TriangleShape;

import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new TriangleShape(3, 4, 5));
        figures.add(new SquareShape(4));
        figures.add(new RectangleShape(2, 8));
        for(Figure figure : figures) {
            PrintInfo(figure);
        }
    }

    private static void PrintInfo(Figure figure){
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);

        System.out.println("Тип фигуры: " + figure.getType() + "; Периметр фигуры: "+ format.format(figure.getPerimeter()) + "; Площадь фигуры: " + format.format(figure.getSquare()));
    }
}
