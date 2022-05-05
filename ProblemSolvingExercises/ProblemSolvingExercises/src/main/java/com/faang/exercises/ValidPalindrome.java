package com.faang.exercises;

public class ValidPalindrome {
    public static void main(String args[]) {
        System.out.println(isValid("ABCBA"));
    }

    static boolean isValid(String input) {
        boolean valid =true;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==input.charAt(input.length()-i-1)){
                continue;
            }
            else{
                valid= false;
                break;
            }
        }
        return  valid;
    }
}
