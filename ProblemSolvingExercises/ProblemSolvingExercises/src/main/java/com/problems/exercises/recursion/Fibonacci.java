package com.problems.exercises.recursion;

public class Fibonacci {
    public static  void main(String args[]){
        System.out.print(fibonacci(7));
    }

    static int fibonacci(int n){
        //base cases
        if(n==0) return 0;
       else if(n==1 ) return 1;
       else
           return  fibonacci(n-1)+fibonacci(n-2);

    }
}
