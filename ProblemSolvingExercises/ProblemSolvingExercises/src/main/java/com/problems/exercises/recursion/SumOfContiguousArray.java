package com.problems.exercises.recursion;

public class SumOfContiguousArray {
    public static void main(String args[]){
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
       for(int i:nums){
           currentSum+=i;
           if(maxSum<currentSum){
               maxSum=currentSum;
           }
           if(currentSum<0){
               currentSum=0;
           }

        }
        return maxSum;
    }
}
