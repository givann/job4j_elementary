package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - post.length; i < word.length; i++) {
            if (word[i] != post[i]) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 't', 'o'};
        char[] post = {'t', 'o'};
        System.out.println(endsWith(word, post));
    }
}
