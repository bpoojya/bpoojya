package com.dsa450.Arrays;

import java.util.Arrays;

/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */
public class ArraySortwith012 {
    public static void main(String args[]){
        Arrays.stream(sort(new int[]{0,2,1,2,0})).forEach(s->System.out.println(s));
    }

    static int[] sort( int[] array){
        int count0=0;
        int count1=0;
        int n= array.length;
        for(int i:array){
            if(i==0) count0++;
            if(i==1) count1++;
        }
        int count2=n-(count0+count1);
        for(int i=0;i<count0;i++) array[i]=0;
        for(int i=count0;i<n-count2;i++) array[i]=1;
        for(int i=n-count2;i<n;i++) array[i]=2;
        return array;

    }

    /**
     * Approach 2
     *  static void sort012(int a[], int arr_size)
     *     {
     *         int lo = 0;
     *         int hi = arr_size - 1;
     *         int mid = 0, temp = 0;
     *         while (mid <= hi) {
     *             switch (a[mid]) {
     *             case 0: {
     *                 temp = a[lo];
     *                 a[lo] = a[mid];
     *                 a[mid] = temp;
     *                 lo++;
     *                 mid++;
     *                 break;
     *             }
     *             case 1:
     *                 mid++;
     *                 break;
     *             case 2: {
     *                 temp = a[mid];
     *                 a[mid] = a[hi];
     *                 a[hi] = temp;
     *                 hi--;
     *                 break;
     *             }
     *             }
     *         }
     *     }
     */
}
