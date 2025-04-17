package com.dsa.practice.slidingWindow;

/**
 * TODO the solution works only for goal < mentioned goal
 * Given a binary array nums and an integer goal. Return the number of non-empty subarrays with a sum goal.
 *
 *
 *
 * A subarray is a continuous part of the array.
 * nums = [1, 1, 0, 1, 0, 0, 1] , goal = 3
 * Output : 4
 * Input : nums = [0, 0, 0, 0, 1] , goal = 0
 *
 * Output : 10
 */

public class BinarySubArrayWithSum {

    public static void main(String[] args) {
        BinarySubArrayWithSum binarySum = new BinarySubArrayWithSum();
        System.out.println(binarySum.findSubArraysSlidingWindow(new int[]{0, 0, 0, 0, 1}, 0));
    }

    private int findSubArrays (int[] input, int goal){

        int result = 0;
        for( int i = 0; i< input.length ;i++){
            int sum = 0;

            for(int j =i ;j<input.length;j++){
                sum+= input[j];
                if(goal == sum) result++;
                if(sum>goal) break;
            }
        }
        return result;
    }


    private int findSubArraysSlidingWindow(int[] input, int goal){
            int right = 0;
            int left = 0;
            int sum = 0;
            int result = 0;

            while(right<input.length){
                sum +=input[right];
                while(sum>goal){
                    sum -= input[left++];
                }
                if (sum ==goal) result+=(right-left+1);

                right++;


            }
            return result;

    }
}
