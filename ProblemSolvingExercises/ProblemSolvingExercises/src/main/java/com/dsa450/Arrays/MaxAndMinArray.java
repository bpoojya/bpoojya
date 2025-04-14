package com.dsa450.Arrays;
/*Write a  function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.
* Time O(nLogn) */

/** Arrays.sort in java uses Tim sort an implementation of quicksort which runs in O(nLogn), you can also implement quicksort here
 *
 */
/*
In approach 2 we can do it in O(n)
 */

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String args[]){
        System.out.println(minElement(new int[]{1000, 11, 445, 1, 330, 3000}));
        System.out.println(maxElement(new int[]{1000, 11, 445, 1, 330, 3000}));

    }
    static int minElement(int[] array){
     int min=array[0];
     for(int i=1;i< array.length;i++){
       min=Math.min(min,array[i]);
     }
        return min;
    }

    static int maxElement(int[] array){
        int max=array[0];
        for(int i=1;i< array.length;i++){
            max=Math.max(max,array[i]);
        }
        return max;
    }


}
