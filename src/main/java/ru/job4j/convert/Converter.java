package ru.job4j.convert;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are: " + out + " eur. Test result : " + passed);

        int inForUsd = 300;
        int expectedForUsd = 5;
        int outUsd = Converter.rubleToDollar(inForUsd);
        boolean passedUsd = expectedForUsd == outUsd;
        System.out.println("300 rubles are: " + outUsd + " usd. Test result : " + passedUsd);
    }
}

