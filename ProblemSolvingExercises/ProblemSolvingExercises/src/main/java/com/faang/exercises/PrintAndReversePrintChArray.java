package com.faang.exercises;

public class PrintAndReversePrintChArray {
    public static void main(String args[]){
        printArray(new char[]{'a','b','c'},0,3);
        reversePrintArray(new char[]{'a','b','c'},2,3);

    }
    static  void printArray(char[] input, int start, int n){
        if(n==0){
            return;
        }
        System.out.println(input[start]);
        printArray(input,start+1,n-1);

    }
    static void reversePrintArray(char[] input, int end, int n){
        if(n==0){
            return;
        }
        System.out.println(input[end]);
        reversePrintArray(input,end-1,n-1);
    }
}
