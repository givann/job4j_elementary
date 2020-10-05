package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int maxThree(int left, int right, int up) {
        int tmp = max(left, right);
        return max(tmp, up);
    }

    public static int maxFour(int left, int right, int up, int down) {
        int tmp = max(left, right);
        int tmp2 = max(tmp, up);
        return max(tmp2, down);
    }


}

