package me.nasif.desginpatterns.strategy.after;

public class Client {

    private static Context context;

    public static void main(String[] args) {

        context = new Context(new Add());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Substract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Multiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new Devide());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }
}
