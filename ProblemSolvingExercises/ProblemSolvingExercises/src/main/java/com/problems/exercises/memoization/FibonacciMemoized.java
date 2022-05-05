package com.problems.exercises.memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoized {
    public static  void main(String args[]){
        System.out.print(fibonacci(7));
    }

    static int fibonacci(int n){
     int[] fibArray = new int[100];
        fibArray[0]=0;
        fibArray[1]=1;
        if(n==0) return 0;
        else if(n==1 ) return 1;
        else if(fibArray[n]!=0) return fibArray[n];
        else {
            fibArray[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return fibArray[n];
        }


    }
}
