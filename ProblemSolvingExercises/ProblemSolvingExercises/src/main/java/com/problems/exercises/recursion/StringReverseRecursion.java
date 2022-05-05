package com.problems.exercises.recursion;

public class StringReverseRecursion {

    public static  void main(String args[]){
        System.out.println("reversed string " + reverseString("hello"));
    }
    public static String reverseString(String input){
        if(input.length()==0){
            return "";
        }
        else{
            return reverseString(input.substring(1,input.length()))+input.charAt(0);
        }
    }
}
