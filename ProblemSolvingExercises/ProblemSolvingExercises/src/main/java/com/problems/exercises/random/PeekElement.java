package com.problems.exercises.random;

public class PeekElement {

    public static void main(String args[]){
        System.out.println(peakElement(new int[]{1,2},2));
    }

    // n: size of array a[]
    public static int peakElement(int[] arr,int n)
    {
        if(n==0||n==1) return 0;
        int low=0; int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mid==0) {
                if(arr[mid]>arr[mid+1])
                    return mid;} else return mid+1;
            if(mid==n-1){
                if(arr[mid]>arr[mid-1]) return mid; else break;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]<arr[mid-1]) high= mid;
            if(arr[mid]<arr[mid+1]) low=mid+1;

        }
        return low;



    }
}
