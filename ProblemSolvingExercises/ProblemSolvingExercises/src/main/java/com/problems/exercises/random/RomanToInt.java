package com.problems.exercises.random;

import java.util.Arrays;

public class RomanToInt {
    public static void main(String args[]){
     System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int i = 0, j = 0, result = 0, n = s.length();
        while (i < n-1) {
            if (getWeight(s.charAt(i)) >=getWeight(s.charAt(i + 1))) {
                result = result + getWeight(s.charAt(i));
                j++;
            } else {
                result = result + getWeight(s.charAt(i + 1)) - getWeight(s.charAt(i));
                j = i + 2;
            }
            i = j;

        }
            if(i!=n) {
                result = result + getWeight(s.charAt(n - 1));
            }
        return result;
    }


   static int getWeight(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        if(c=='M'){
            return 1000;
        }
        else{
            return 0;
        }

    }
}

