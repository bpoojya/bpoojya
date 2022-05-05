package com.faang.exercises;

import java.util.Stack;

public class ReverseStringON {
    public static void main(String args[]){
        System.out.println(reverseString("hello"));
    }

    static String reverseString(String input){
        String output="";
        Stack<Character> stack= new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);

        }
        int length= stack.size();
        for(int i=0;i<length;i++){
            output=output+stack.pop();
        }

        return output;

    }
}
