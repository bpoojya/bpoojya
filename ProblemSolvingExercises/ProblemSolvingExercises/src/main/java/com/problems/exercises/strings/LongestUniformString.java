package com.problems.exercises.strings;

import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class LongestUniformString {
    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

   static int[] longestUniformSubstring(String input){
        int longestStart=0;
        int longestEnd=0;
        int currSize=0; int maxSize=0;
       char c1[]=input.toCharArray();
       for(int i=0;i<c1.length;i++) {
        maxSize=Math.max(currSize,maxSize);
           for (int j = i + 1; j < c1.length; j++) {
               if (c1[i] == c1[j]) {

                   continue;
               } else {
                   currSize = j - i-1;


                   if (currSize >= maxSize) {
                       longestEnd = j-1;
                       longestStart = i;

                   }
                   break;
               }
           }
       }
        return new int[]{ longestStart, longestEnd };
    }



    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 6});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}

