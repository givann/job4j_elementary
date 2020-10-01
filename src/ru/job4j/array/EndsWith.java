package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length - 1, j = word.length - 1; i > 0;
             i--, j--) {
            if (post[i] != word[j]) {

                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'i'};




        System.out.println(endsWith(word, post));
    }
}
