package me.nasif.patterns.creational.factory;

public class Client {

    private static final ShapeFactory shapeFactory = new ShapeFactory();

    public static void main(String[] args) throws Exception {

        shapeFactory.getShape(Shape.CIRCLE).draw();
        shapeFactory.getShape(Shape.TRIANGLE).draw();
        shapeFactory.getShape(Shape.RECTANGLE).draw();

    }
}
