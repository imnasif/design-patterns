package me.nasif.patterns.creational.abstractFactory;

public class ColorFactory extends AbstractFactory {

    public Fillable getColor(Color color) {

        switch (color) {

            case RED:
                return new Red();

            case GREEN:
                return new Green();

            case BLUE:
                return new Blue();

            default:
                return null;
        }
    }

}
