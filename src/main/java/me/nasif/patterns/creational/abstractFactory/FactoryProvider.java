package me.nasif.patterns.creational.abstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(Factory factory) {

        switch (factory) {

            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;

        }
    }
}
