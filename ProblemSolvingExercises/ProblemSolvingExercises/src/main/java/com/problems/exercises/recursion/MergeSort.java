package com.problems.exercises.recursion;
//Divide and Conquer

import java.util.Arrays;

public class MergeSort {
    public static  void main (String args[]){
        Arrays.stream(mergeSort(new int[]{13,21,3,4,8,7,6,40,90},0,8)).forEach(s->System.out.println(s));
    }
//do not modify the existing array
    static int[] mergeSort(int[] data, int start, int end){
       if(start<end){
           int mid= (start+end)/2;
           mergeSort(data,start,mid);
           mergeSort(data,mid+1,end);
           merge(data,start,mid,end);
       }

        return data;

    }
    static void merge(int[] data,int start, int mid, int end){
        int[] temp= new int[end-start+1];
       int i=start;int j=mid+1; int k=0;
       while(i<=mid && j<=end){
           if(data[i]<data[j]){
               temp[k++]=data[i++];
           }
           else{
               temp[k++]=data[j++];
           }
       }
       while(i<=mid){
           temp[k++]=data[i++];
       }
        while(j<=end){
            temp[k++]=data[j++];
        }
        for(int p=start;p<=end;p++){
            data[p]=temp[p-start];
        }
    }
}
