package com.dsa.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
     *
     * Example 1:
     *
     * Input: nums = [1, 2, 3, 3]
     *
     * Output: true
     *
     * Example 2:
     *
     * Input: nums = [1, 2, 3, 4]
     *
     * Output: false
     */

    public static void main(String[] args) {
        System.out.println(hasDuplicateLinear(new int[]{1,2,3,4}));
    }

    //o(logn)+o(n)
    private static boolean hasDuplicate(int[] input){
        Arrays.sort(input);
        for(int i = 1;i<input.length;i++){
            if(input[i] == input[i-1]) return true;
        }
        return false;

    }
    //

    private static boolean hasDuplicateLinear(int[] input){
       final HashSet<Integer> set = new HashSet<>();

       for(int i : input){
           if(!set.add(i)) return true;
       }

       return false;
    }

}
