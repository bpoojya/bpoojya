package com.dsa.practice.arrays;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 *
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 *
 * Return the answer with the smaller index first.
 *
 * Example 1:
 *
 * Input:
 * nums = [3,4,5,6], target = 7
 *
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        Arrays.stream(findIndices(new int[]{3, 4, 5, 6}, 7)).forEach(System.out::println);
    }

    private static int[] findIndices(int[] input, int target){
        final int[] result = new int[2];

        final Map<Integer, Integer> sumMap = new HashMap<>();

        for(int i = 0; i <input.length; i++){
            if(!sumMap.containsKey(target-input[i])) sumMap.put(input[i], i);
            else {result[1] =(i); result[0] =(sumMap.get(target-input[i])); break;}

        }
        return result;

    }
}
