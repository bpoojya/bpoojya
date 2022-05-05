package com.faang.exercises;

public class ReverseStringTwoPointerApproach {
    public static void main(String args[]){
        System.out.println(reverseString("hello"));
    }
    static String reverseString(String input) {
        int i=0;int j=input.length()-1;
        char c[]=input.toCharArray();
        while(i<=j){
           char temp=c[i];
           c[i]=c[j];
           c[j]=temp;
           i++;j--;

        }
        return new String(c);
    }

}
