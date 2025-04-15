package com.dsa.practice.arrays;

/**
 * Given a string s, return true if it is a palindrome, otherwise return false.
 *
 * A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
 *
 * Example 1:
 *
 * Input: s = "Was it a car or a cat I saw?"
 *
 * Output: true
 *
 * Input: s = "tab a cat"
 *
 * Output: false
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkPalindrome("tab a cat"));
    }
    private static boolean checkPalindrome(String s){
        int left = 0 ;
        int right = s.length() -1;

        while(left < right){

            while(left < right && !Character.isAlphabetic(s.charAt(left))) left++;
            while(left < right && !Character.isAlphabetic(s.charAt(right))) right--;

            if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
