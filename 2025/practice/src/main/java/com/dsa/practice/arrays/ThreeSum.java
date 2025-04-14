package com.dsa.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0,
 * and the indices i, j and k are all distinct.
 *
 * The output should not contain any duplicate triplets. You may return the output and the triplets in any order.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 *
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 */

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    private static List<List<Integer>> threeSum(int[] input) {
        Arrays.sort(input);
        final List<List<Integer>> result = new ArrayList<>();
        //-4,-1,-1,0,1,2
        for (int i = 0; i < input.length; i++) {

            if(input[i]>0) break; // positive values cant sum to 0
            if( i > 0 && input[i] == input[i-1]) continue; // do not consider duplicates

            int first = input[i];
            int low = i + 1;
            int high = input.length - 1;

            while (low < high) {
                int second = input[low];
                int third = input[high];

                int sum = first + second + third;

                if(sum > 0){
                    high--;
                }
                else if(sum < 0){
                    low++;
                }

                else {
                    result.add(Arrays.asList(first, second, third));
                    low++;
                    high--;
                    while(low<high && input[low] == input[low-1]) low++;


                }
            }
        }

        return result;
    }
}
