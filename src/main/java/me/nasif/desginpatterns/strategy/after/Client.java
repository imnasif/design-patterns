package me.nasif.desginpatterns.strategy.after;

public class Client {

    private static final Context context = new Context();

    public static void main(String[] args) {

        context.setStrategy(new Add());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new Substract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new Multiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        
        context.setStrategy(new Devide());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }
}
