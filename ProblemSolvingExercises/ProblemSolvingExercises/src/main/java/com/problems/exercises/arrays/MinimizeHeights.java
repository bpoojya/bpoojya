package com.problems.exercises.arrays;

import java.util.Arrays;

public class MinimizeHeights {
    public static void main(String args[]){
        int arr[]= new int[]{2,6 ,3 ,4, 7, 2, 10, 3, 2, 1};
        System.out.println(minimizeHeights(arr,10,5));
    }

    static int minimizeHeights(int[] arr, int n, int k) {
        int diff=0;
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                arr[i]=arr[i]+k;

            }
            else if(arr[i]>=k){
                arr[i]=arr[i]-k;
            }
        }


        Arrays.sort(arr);
        return arr[n-1]-arr[0];
    }
}
