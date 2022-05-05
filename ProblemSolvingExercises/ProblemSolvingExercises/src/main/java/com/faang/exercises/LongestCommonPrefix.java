package com.faang.exercises;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static void main(String args[]) {
        System.out.println(longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }

    static String longestCommonPrefix(String[] strs) {

      /*  if (strs.length == 1) {
            return strs[0];
        }
        String compare = getMinimunLength(strs);
        String prefix = "";
        int i = 0;
        while (i < compare.length()) {
            int j = 0;
            while (j < strs.length) {
                if (strs[j].charAt(i) == compare.charAt(i)) {
                    j++;
                } else {
                    break;
                }
            }
            if (j == strs.length) {
                prefix = prefix + compare.charAt(i);
                i++;
            } else {
                break;
            }

        }
        return prefix;
    }

    static String getMinimunLength(String[] input) {
        String output = "";
        int minLength = input[0].length();
        for (int i = 0; i < input.length; i++) {
            int currLength = input[i].length();
            if (currLength == 0) {
                return input[i];
            } else if (currLength <= minLength) {

                output = input[i];
            }

        }
        return output;
    }

     */

       Arrays.sort(strs);

    String first=strs[0];
    String second=strs[strs.length-1];
    String result="";


        for(int i=0;i<first.length();i++){
        if(first.charAt(i)==second.charAt(i)) result+=first.charAt(i);
        else break;
    }
        return result;
}
}
