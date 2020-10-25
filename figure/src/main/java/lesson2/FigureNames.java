package lesson2;

public enum FigureNames {
    SQUARE("Квадрат"),
    TRIANGLE("Треугольник"),
    RECTANGLE("Прямоугольник")
    ;

    private String name;

    FigureNames( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
