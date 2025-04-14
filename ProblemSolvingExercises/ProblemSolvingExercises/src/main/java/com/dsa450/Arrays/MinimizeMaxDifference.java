package com.dsa450.Arrays;

import java.util.Arrays;

/**
 * Given an array arr[] denoting heights of N towers and a positive integer K.
 *
 * For each tower, you must perform exactly one of the following operations exactly once.
 *
 * Increase the height of the tower by K.
 * Decrease the height of the tower by K ( you can do this operation only if the height of the tower is greater than or equal to K)
 * Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
 * Input:
 * K = 2, N = 4
 * Arr[] = {1, 5, 8, 10}
 * Output:
 * 5
 * Explanation:
 * The array can be modified as
 * {3, 3, 6, 8}. The difference between
 * the largest and the smallest is 8-3 = 5.
 */
public class MinimizeMaxDifference {

    public static void main(String args[]) {
        System.out.println(minimize(new int[]{3, 9, 12, 16, 20}, 3));
    }

    static int minimize(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <=k)
                array[i] += k;

            else
                array[i] -= k;


        }
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }
}
