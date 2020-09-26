package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int summ = (int) (amount + amount * percent / 100);
        int year = 0;
        while (summ > salary || summ > 0) {
            summ = summ - salary;
            year++;
        }

        return year;
    }


    public static void main(String[] args) {
        System.out.println(year(100, 120, 50));

    }
}
