package com.faang.exercises;

public class ArraySortedRecursion {
    public static void main(String args[]) {
        System.out.println(isArraySorted2(new int[]{1,5,6,8},0,4));
    }

    static boolean isArraySorted(int array[], int start, int n ){
        if(n==0||n==1){
            return true;

        }
        if(array[start]>array[start+1]){
            return false;
        }

            boolean isSorted= isArraySorted(array,start+1,n-1);
        return isSorted;

    }

    static  boolean isArraySorted2(int array[], int start, int n ){
        if(n==0||n==1){
            return true;

        }
        boolean isSorted= isArraySorted2(array,start+1,n-1);
        if(!isSorted){
            return false;
        }
        if(array[start]>array[start+1]){
            return false;
        }
        else{
            return true;
        }

    }
}
