package com.faang.exercises;

public class LastIndexOfElemet {
    public static void main(String args[]) {
        System.out.println(findLastIndex(new int[]{5,5,6,7,8,6,3,8}, 7,8,6));
    }
 static int findLastIndex(int input[],int end, int n, int target){

        if(n==0){
            return -1;
                }

        if(input[end]==target){
           return end;

        }
       return findLastIndex(input,end-1,n-1,target);
 }
}
