package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rsl = number > 1;
        int count = 0;
        for (int i = number; i >= 2; i--) {
            if (number % i == 0) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(4));
        System.out.println(check(1));
        System.out.println(check(8));
        System.out.println(check(743));
        System.out.println(check(9));

    }
}