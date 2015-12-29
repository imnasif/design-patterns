package me.nasif.patterns.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory {

    public Drawable getShape(Shape shape) {

        switch (shape) {

            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            case TRIANGLE:
                return new Triangle();

            default:
                return null;
        }
    }

}
