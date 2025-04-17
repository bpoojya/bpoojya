package com.dsa.practice.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    /**
     * Given a string s, find the length of the longest substring without duplicate characters.
     *
     * A substring is a contiguous sequence of characters within a string.
     *
     * Example 1:
     *
     * Input: s = "pwwkew"
     *
     * Output: 3
     */


    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingChars longest = new LongestSubStringWithoutRepeatingChars();
        System.out.println(longest.findLongestWithHashSet("zxyzxyz"));
    }

    private int findLongest(String s, int i){
        int result = 0;

        final Map<Character,Integer> freqMap = new HashMap<>();
        int left = 0;
        int right = 0;

        while(right<s.length()){
            if(freqMap.containsKey(s.charAt(right))){
                int currIndex = freqMap.get(s.charAt(right));

                left = Math.max(left,currIndex+1);
            }
            freqMap.put(s.charAt(right),right);
            result= Math.max(result, right-left+1);
            right++;


        }
        return result;

    }

    private int findLongestWithHashSet(String s){
        int result = 0;

     final Set<Character> visited = new HashSet<>();
        int left = 0;
        int right = 0;

        while(right<s.length()){
            while(visited.contains(s.charAt(right))){
                visited.remove(s.charAt(left++));
            }
            visited.add(s.charAt(right));
            result= Math.max(result, right-left+1);
            right++;


        }
        return result;

    }


}
