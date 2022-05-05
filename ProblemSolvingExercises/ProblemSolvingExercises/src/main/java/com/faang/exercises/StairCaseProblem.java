package com.faang.exercises;

public class StairCaseProblem {
    public static void main(String args[]){
        System.out.print(noOfWays(5));
    }

    static int noOfWays(int n){
        if(n==0||n==1){
           return 1;
        }
        if(n<0){
            return 0;
        }

            return noOfWays(n-1)+noOfWays(n-2)+noOfWays(n-3);

    }
}
