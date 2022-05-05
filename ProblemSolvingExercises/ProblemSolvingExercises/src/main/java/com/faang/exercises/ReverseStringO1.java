package com.faang.exercises;

public class ReverseStringO1 {
    public static void main(String args[]){
        System.out.println(reverseString("hello"));
    }

    static String reverseString(String input) {
        String output="";
        int length=input.length();
        for(int i=0;i<length;i++){
            output=output+input.charAt(length-1-i);

        }
        return output;


    }
}
