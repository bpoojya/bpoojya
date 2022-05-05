package com.faang.exercises;

public class FirstIndexOfElement {
    public static void main(String args[]) {
        System.out.println(findFirstIndex(new int[]{5,5,6,7,8,6,3,8}, 0,8,10));
    }
 static int findFirstIndex(int input[],int start, int n, int target){

        if(n==0){
            return -1;
                }

        if(input[start]==target){
           return start;

        }
       return findFirstIndex(input,start+1,n-1,target);
 }
}
