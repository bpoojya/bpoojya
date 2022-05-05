package com.faang.exercises;

public class PrintAllIndecesOfElement {
    public static void main(String args[]) {
        printAllIndices(new int[]{5,5,6,7,8,6,3,8}, 0,8,5);
    }
 static void printAllIndices(int input[],int start, int n, int target){

        if(n==0){
            System.out.println("No values to Print");
            return ;
                }

        if(input[start]==target){
          System.out.println(start);

        }
        printAllIndices(input,start+1,n-1,target);
 }
}
