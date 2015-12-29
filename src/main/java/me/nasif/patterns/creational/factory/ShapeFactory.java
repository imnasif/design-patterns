package me.nasif.patterns.creational.factory;

public class ShapeFactory {

    public Drawable getShape(Shape shape) throws Exception {

        switch (shape) {

            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            case TRIANGLE:
                return new Triangle();

            default:
                throw new Exception("Undefined Shape");
        }
    }
}
