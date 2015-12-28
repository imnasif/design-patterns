package me.nasif.desginpatterns.strategy.after;

public class Add implements Strategy {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

}
