package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        if (left.length + right.length == 0) {
            return new int[0];
        } else if (left.length == right.length) {
            rsl = eqLeng(left, right);
        } else if (left.length < right.length) {
            if (left.length == 0) {
                for (int i = 0; i < right.length; i++) {
                    rsl[count] = right[i];
                    count++;
                }
                return rsl;
            }
            rsl = eqLeng(left, right);
            count = left.length * 2;
            for (int i = (left.length - 1) * 2; i < right.length; i++) {
                rsl[count] = right[i];
                if (rsl[count] < rsl[count - 1]) {
                    int tmp = rsl[count];
                    rsl[count] = rsl[count - 1];
                    rsl[count - 1] = tmp;
                }
                count++;
            }
        } else if (right.length < left.length) {
            if (right.length == 0) {
                for (int i = 0; i < left.length; i++) {
                    rsl[count] = left[i];
                    count++;
                }
                return rsl;
            }
            rsl = eqLeng(left, right);
            count = right.length * 2;
            for (int i = left.length - 1; i > right.length - 1; i--) {
                rsl[count] = left[i];
                if (rsl[count] < rsl[count - 1]) {
                    int tmp = rsl[count];
                    rsl[count] = rsl[count - 1];
                    rsl[count - 1] = tmp;
                }
                if (count < rsl.length - 1) {
                    count++;
                }
            }
        }
        return rsl;
    }

    public static int[] eqLeng(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int lngt = (left.length < right.length) ? left.length : right.length;
        for (int i = 0; i < lngt; i++) {
            if (left[i] < right[i]) {
                rsl[count] = left[i];
                count++;
                rsl[count] = right[i];
            } else if (right[i] < left[i]) {
                rsl[count] = right[i];
                count++;
                rsl[count] = left[i];
            }
            if (count > 1) {
                if (rsl[count - 1] < rsl[count - 2]) {
                    int tmp = rsl[count - 1];
                    rsl[count - 1] = rsl[count - 2];
                    rsl[count - 2] = tmp;
                }
            }

            count++;
        }
        return rsl;
    }
}