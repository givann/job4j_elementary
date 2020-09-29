package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int j = 0; j < pref.length; j++) {
            if (word[j] != pref[j]) {
                return false;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'у'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(startsWith(word, pref));
    }
}
