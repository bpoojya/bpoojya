package com.faang.exercises;

public class ValidPalindrmeRecursion {
    public static void main(String args[]) {
        System.out.println(isValid("ABCCBA"));
    }

    static boolean isValid(String input) {
        if (input.length() == 1 || input.length() == 0) {
            return true;
        }
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        } else {

            return isValid(input.substring(1, input.length() - 1));

        }
    }
}
