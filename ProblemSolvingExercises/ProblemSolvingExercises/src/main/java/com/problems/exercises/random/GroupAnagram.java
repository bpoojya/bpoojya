package com.problems.exercises.random;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class GroupAnagram {
    static String input = "cat dog tac sat tas god dog";

    static String setOfAnagrams(String inputString) {

        String set[] = inputString.split(" ");
        String output = "";
       Map<String,Integer> map= new HashMap<>();
        for (int i = 0; i < set.length; i++) {
            char c1[] = set[i].toCharArray();
            Arrays.sort(c1);
           String s= new String(c1);
            if (!map.containsKey(s) ){
                map.put(s,i);
            }
            output=output+set[map.get(set[i])];

        }
return null;

    }

    public static void main(String[] args) {

        String input = "cat dog tac sat tas god dog";
      String resultString = setOfAnagrams(input);
      System.out.println(resultString);

    }
}
