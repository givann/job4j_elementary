package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ac + bc > ab && ab + bc > ac) ? true : false;

    }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 3.0, 2.0));
    }
}