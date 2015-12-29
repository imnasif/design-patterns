package me.nasif.patterns.creational.abstractFactory;

public class Client {

    private static final ShapeFactory shapeFactory = (ShapeFactory) FactoryProvider.getFactory(Factory.SHAPE);
    private static final ColorFactory colorFactory = (ColorFactory) FactoryProvider.getFactory(Factory.COLOR);

    public static void main(String[] args) throws Exception {

        shapeFactory.getShape(Shape.CIRCLE).draw();
        shapeFactory.getShape(Shape.RECTANGLE).draw();
        shapeFactory.getShape(Shape.TRIANGLE).draw();
        
        colorFactory.getColor(Color.RED).fill();
        colorFactory.getColor(Color.GREEN).fill();
        colorFactory.getColor(Color.BLUE).fill();
        

    }
}
