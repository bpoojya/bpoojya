package com.dsa.practice.slidingWindow;

/**
 * Given a binary array nums and an integer k, flip at most k 0's.
 *
 * Return the maximum number of consecutive 1's after performing the flipping operation.
 *
 *
 * Examples:
 * Input : nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3
 *
 * Output : 10
 *
 * Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present at position 3, 4, 5 (0 base indexing).
 *
 * The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].
 *
 * The number of consecutive 1's is 10.
 */

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        MaxConsecutiveOnesIII consecutives = new MaxConsecutiveOnesIII();
        System.out.println(consecutives.longestOnesSlidingWindow(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }


    private int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for(int i = 0; i< nums.length ; i++){
            int ones = 0;

            for(int  j= i; j<nums.length ;j++){
                if(nums[j] == 1) ones++;

                if(j-i+1 -ones <= k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxLen;


    }

    //1,1,1,0,0,0,1,1,1,1,0  k =2;
    private int longestOnesSlidingWindow(int[] nums, int k){

        int left = 0;
        int right = 0;
        int ones = 0;
        int maxLen = 0;

        while(right < nums.length){

            if(nums[right] == 1) {
                ones++;
                  }
            if(right-left+1-ones >k){
                if(nums[left] == 1) ones--;
                left++;


            }

            maxLen = Math.max(maxLen, right-left+1);
            right++;

        }

        return maxLen;
    }
}
