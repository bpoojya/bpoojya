package com.problems.exercises.random;

public class findMaxConsecutiveOnes {

    public static int findMaxConsecutiveOne(int[] nums) {
        int max=0;
        int finalMax=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                max++;
            } else {
                finalMax = Math.max(finalMax, max);
                max = 0;

            }
        }
        return finalMax;
    }

    public static void main(String args[]){
        System.out.println(findMaxConsecutiveOne(new int[]{1,1,0,1,1,1}));
    }
}


