package com.faang.exercises;

public class ReverseStringRecursion {
    public static void main(String args[]){
        System.out.println(reverseString("hello"));
    }
    static String reverseString(String input) {
        if(input.length()==0){
            return input;
        }
        else{
            return input.charAt(input.length()-1)+reverseString(input.substring(0,input.length()-1));
        }
    }
}
