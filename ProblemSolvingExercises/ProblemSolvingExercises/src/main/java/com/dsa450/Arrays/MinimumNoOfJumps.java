package com.dsa450.Arrays;

/**
 * Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element.
 * Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
 *
 * Note: Return -1 if you can't reach the end of the array.
 * Input:
 * N = 11
 * arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3
 * Explanation:
 * First jump from 1st element to 2nd
 * element with value 3. Now, from here
 * we jump to 5th element with value 9,
 * and from here we will jump to the last.
 */
public class MinimumNoOfJumps {

    public static void main(String args[]) {

        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));


    }

    static int minJumps(int[] array) {
        int n = array.length;
        if (n <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (array[0] == 0)
            return -1;

        int maxReach=array[0];
        int step=array[0];

       int jump=1;
        for (int i = 1; i < array.length; i++) {
            // Check if we have reached
// the end of the array
            if (i == array.length - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i + array[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0) {
                // we must have used a jump
                jump++;

                // Check if the current
// index/position or lesser index
                // is the maximum reach point
// from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }

        return -1;
    }
}
