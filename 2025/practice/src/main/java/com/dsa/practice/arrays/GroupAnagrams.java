package com.dsa.practice.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 *
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 *
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 */

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();

        System.out.println(ga.groupUsingStreams(new String[]{"act","pots","tops","cat","stop","hat"}));

    }

    private List<List<String>> group(String[] strs){

     final Map<String, List<String>> result = new HashMap<>();

     for(String s:strs){
         final char[] curr = s.toCharArray();
         Arrays.sort(curr);

         result.computeIfAbsent(Arrays.toString(curr), (k)->new ArrayList()).add(s);


     }
     return new ArrayList<>(result.values());

    }

    private List<List<String>> groupUsingTable(String[] strs){

        final Map<String, List<String>> result = new HashMap<>();

        for(String s:strs){
          int count[] = new int[26];

          for(char c:s.toCharArray()){
              count[c-'a']++;
          }
          String key = Arrays.toString(count);


            result.computeIfAbsent(key, (k)->new ArrayList()).add(s);


        }
        return new ArrayList<>(result.values());

    }

    /** can i use java 8 streams
     *
     */


    private List<List<String>> groupUsingStreams(String[] strs){

        Map<String, List<String>> collect = Arrays.stream(strs).collect(Collectors.groupingBy(str -> {
            final char[] curr = str.toCharArray();
            Arrays.sort(curr);
        return String.valueOf(curr);
        }));




        return new ArrayList<>(collect.values());
    }

}
