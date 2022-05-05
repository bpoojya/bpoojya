package com.faang.exercises;

public class ReplaceCharacters {
    public static void main(String args[]) {
        System.out.println(replaceChars(new char[]{'a', 'b', 'c', 'a', 'd', 'x'}, 0, 6, 'a', 'x'));
    }

    static char[] replaceChars(char input[], int start, int n, char target, char value) {
        if (n == 0) {
            return input;
        }
        if (input[start] == target) {
            input[start] = value;
        }
        return replaceChars(input, start + 1, n - 1, target, value);

    }
}
