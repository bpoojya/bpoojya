package com.dsa450.Arrays;

import java.util.*;

public class MergeSortedArray {

    public static void main(String args[]) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));

    }

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }


        int localMin = Integer.MAX_VALUE;
        String output = "";
        int formed = 0;

        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            int count = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), count + 1);
        }

        Map<Character, Integer> w = new HashMap<Character, Integer>();
        int required=tMap.size();

        int i=0;
        int j=0;
        String min="";
        while(i<s.length() && j<s.length())
        {
            char c=s.charAt(i);
            int val=w.getOrDefault(c,0);
            w.put(c,val+1);

            if(w.get(c)==tMap.get(c)) formed++;

            while(formed==required && j<=i){
                c=s.charAt(j);
                min=s.substring(j,i+1);
                if( min.length()<localMin)
                {
                    localMin=min.length();
                    output=min;
                }
                w.put(c, w.get(c) - 1);
                if(w.get(c).intValue()<tMap.get(c).intValue()) formed --;

                j++;

            }

            i++;



        }

        return output;

    }



}

