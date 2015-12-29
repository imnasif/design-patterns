package me.nasif.patterns.behavioral.strategy;

public class Multiply implements Strategy {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }

}
