package com.dsa450.Arrays;

/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 */
public class LargestSumOfContiguosSubArray {
    public static void main(String args[]){
        System.out.println(largestSum(new int[]{-1,2,3,-4}));


    }

    static  int largestSum( int[] array){
        int sum=0;int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            maxSum= Math.max(maxSum,sum);
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
