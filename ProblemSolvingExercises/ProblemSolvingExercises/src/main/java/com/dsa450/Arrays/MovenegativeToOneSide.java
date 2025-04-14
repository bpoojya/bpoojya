package com.dsa450.Arrays;

import java.util.Arrays;

/**
 * Move all negative numbers to beginning and positive to end with constant extra space
 *
 * Difficulty Level : Easy
 * Last Updated : 14 Jun, 2022
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
 *
 * Examples :
 *
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 *
 */

public class MovenegativeToOneSide {
    public static void main(String args[]){
        Arrays.stream(moveArray(new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6})).forEach(s->System.out.println(s));
        Arrays.stream(moveArray2(new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6})).forEach(s->System.out.println(s));
    }

    /**
     * Approach 1 quick sort partitioning
     * @param array
     * @return
     */
    static int[] moveArray( int[] array){

        int j=0;
       for(int i=0;i<array.length;i++){
           if(array[i]<0) {
               if(i!=j){
                   int temp= array[i];
                   array[i]= array[j];
                   array[j]=temp;
               }
               j++;
           }
        }
        return array;
    }

    /**
     * Approach 2 simple 2 pointer
     * @param array
     * @return
     */
    static int[] moveArray2( int[] array){
        int i=0;
        int j=array.length-1;
       while(i<=j){
           if(array[i]<0) i++;
           else{
               int tem=array[i];
               array[i]=array[j];
               array[j]=tem;
               j--;
           }
       }
        return array;
    }
}
