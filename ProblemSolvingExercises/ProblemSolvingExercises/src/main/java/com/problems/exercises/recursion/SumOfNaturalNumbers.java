package com.problems.exercises.recursion;

public class SumOfNaturalNumbers {
    public static  void main(String args[]){
        System.out.println(sumNumbers(9));
    }
    static  int sumNumbers(int number){
        if(number==1){
            return 1;
        }
        else{
            return  number+sumNumbers(number-1);
        }

    }
}
