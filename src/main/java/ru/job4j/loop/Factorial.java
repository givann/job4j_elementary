package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n <= 1) {
            return 1;
        } else
            return n * calc(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calc(0));
    }
}