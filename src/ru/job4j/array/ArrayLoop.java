package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
