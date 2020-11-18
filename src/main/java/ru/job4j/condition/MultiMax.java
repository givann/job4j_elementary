package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > third && second > first) {
            return second;
        } else {
            return third;
        }
    }

}
