package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{10, 5, 3, 1}, 1, 3));
    }
}
