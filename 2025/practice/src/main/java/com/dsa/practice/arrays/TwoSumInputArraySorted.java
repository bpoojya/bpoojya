package com.dsa.practice.arrays;

import java.util.Arrays;

public class TwoSumInputArraySorted {
    /**
     * Given an array of integers numbers that is sorted in non-decreasing order.
     *
     * Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
     *
     * There will always be exactly one valid solution.
     *
     * Your solution must use
     * O
     * (
     * 1
     * )
     * O(1) additional space.
     * Input: numbers = [1,2,3,4], target = 3
     *
     * Output: [1,2]
     */

    public static void main(String[] args) {
        Arrays.stream(findIndices(new int[]{1,2,3,4},3)).forEach(System.out::println);
    }

    private static int[] findIndices(int[] input, int target){
        int left = 0;
         int right = input.length-1;

         while(left < right){
             int sum =input[left] + input[right];

             if(sum == target){
                 return new int[]{left+1, right+1};
             }
             else if( sum > target){
                 right --;
             }
             else{
                 left++;
             }
         }

         return new int[]{};
    }
}
