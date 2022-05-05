package com.problems.exercises.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KSmallestElement {
    public static void main(String args[]) {
        commonElements(new int[]{1, 5, 10, 20, 40, 80}, new int[]  {6, 7, 20, 80, 100}, new int[] {3, 4, 15, 20, 30, 70, 80, 120},6,5,8);
        ;
    }

   static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n1;i++){
            int val1= binarySearch(B,A[i],0,n2);
            int val2= binarySearch(C,A[i],0,n3);
            if(val1!=-1&& val2!=-1){
                list.add(A[i]);
            }

        }
        return list;


    }

    static int binarySearch(int arr[],int val, int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==val) return mid;
            else if(val<arr[mid]) return binarySearch(arr, val, low, mid-1);
            else return binarySearch(arr, val, mid+1, high);


        }
        return -1;
    }
}