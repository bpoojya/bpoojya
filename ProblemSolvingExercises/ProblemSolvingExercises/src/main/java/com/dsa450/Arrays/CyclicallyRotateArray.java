package com.dsa450.Arrays;

import java.util.Arrays;

/**
 * Given an array, rotate the array by one position in clock-wise direction.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * A[] = {1, 2, 3, 4, 5}
 * Output:
 * 5 1 2 3 4
 */
public class CyclicallyRotateArray {
    public static void main(String argss[]){
        Arrays.stream(cyclicRotation(new int[]{1, 2, 3, 4, 5})).forEach(s->System.out.println(s));

    }

    static int[] cyclicRotation(int[] array){
        int x= array[array.length-1];
        for(int i= array.length-1;i>0;i--){
            array[i]=array[i-1];

        }
        array[0]=x;
        return array;
    }
}
