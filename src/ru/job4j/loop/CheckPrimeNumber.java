package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
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

}