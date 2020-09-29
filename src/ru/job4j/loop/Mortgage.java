package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        amount += (int) amount * percent / 100;
        int year = 0;
        while (amount > salary || amount > 0) {
            amount = amount - salary;
            year++;
        }

        return year;
    }


    public static void main(String[] args) {
        System.out.println(year(100, 100, 0));

    }
}
