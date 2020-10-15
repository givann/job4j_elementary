package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += (int) (amount * percent / 100) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(150, 100, 50));

    }
}
