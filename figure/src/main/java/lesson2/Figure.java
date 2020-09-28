package lesson2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Figure {

    public static void main(String[] args) {
        System.out.println("Привет! Введи цифру, соответствующую фигуре: 1 - квадрат, 2 - треугольник, 3 - прямоугольник");

        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        double s = 0;

        while (true) {
            String figure = in.nextLine();

            if (figure.equals("1")) {
                float a = getNum("стороны квадрата");
                s = a * a;
                break;
            } else if (figure.equals("2")) {
                float a = getNum("1-ой стороны треугольника");
                float b = getNum("2-ой строоны треугольника");
                float c = getNum("3-ей стороны треугольника");
                float p = (a + b + c) / 2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            } else if (figure.equals("3")) {
                float a = getNum("ширины прямоугольника");
                float b = getNum("длины прямоугольника");
                s = a * b;
                break;
            } else {
                System.out.println("Мы такого не предлагали! Введи цифру, соответствующую фигуре: 1 - квадрат, 2 - треугольник, 3 - прямоугольник");
            }
        }
        in.close();
        System.out.println( "Площадь твоей фигуры равна " + format.format(s) );

    }

    //функция обработки введенных пользователем значений, привожу их к числовому типу и обрабатываю исключения
    private static float getNum(String name){
        float number = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Задай размер " + name);
            if (in.hasNextFloat()) {
                number = in.nextFloat();
                break;
            } else {
                System.out.println("Извините, но это явно не число. Попробуйте снова!");
            }
        }
        return number;
    }
}
