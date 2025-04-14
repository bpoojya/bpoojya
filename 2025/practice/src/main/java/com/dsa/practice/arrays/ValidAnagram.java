package com.dsa.practice.arrays;

public class ValidAnagram {
    /**
     * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
     *
     * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
     *
     * Example 1:
     *
     * Input: s = "racecar", t = "carrace"
     *
     * Output: true
     * Example 2:
     *
     * Input: s = "jar", t = "jam"
     *
     * Output: false
     * Constraints:
     *
     * s and t consist of lowercase English letters.
     */

    public static void main(String[] args) {
        System.out.println(validAnagram("jar","raj"));
    }

    private static boolean validAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int source[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            source[s.charAt(i) - 'a']++;
            source[t.charAt(i) - 'a']--;
        }

        for(int i:source){
            if(i !=0) return false;
        }
        return true;


    }
}
