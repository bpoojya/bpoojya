package com.problems.exercises.recursion;

public class DecimaltoBinaryConversion {
    public static void main(String args[]) {
        System.out.println(decimalToBinary(20));
    }

    static String decimalToBinary(int number) {

        if (number == 0) {
            return String.valueOf(number);
        } else {
            return   decimalToBinary(number/2) +String.valueOf(number % 2);

        }
    }
}
