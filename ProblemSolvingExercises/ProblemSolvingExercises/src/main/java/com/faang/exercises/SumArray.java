package com.faang.exercises;

public class SumArray {
    public static void main(String args[]) {
      //  System.out.println(sumArray2(new int[]{1, 5, 6, 8}, 3, 4));
        System.out.println(sumArray(new int[]{1, 5, 6, 8},  4));
    }

    static int sumArray(int[] input, int n) {
        if (n == 0) {
            return 0;
        }
        //recursion
        int sum = sumArray(input,  n - 1);
        //calculation
        return sum + input[n-1];
    }

    //breaking arry from end
    static int sumArray2(int[] input, int end, int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return input[end];
        }
        //recursion
        int sum = sumArray2(input, end-1, n - 1);
        //calculation
        return sum + input[end];
    }
}
