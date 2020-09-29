package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;

        int count = 0;
        int ex = money - price;
        while (ex != 0) {
            if (ex >= COINS[size]) {
                ex = ex - COINS[size];
                rsl[count] = COINS[size];
                count++;

            } else {
                size++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

}

