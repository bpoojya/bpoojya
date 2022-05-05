package com.problems.exercises.random;

import java.util.*;

public class Dictionary {
    private String[] entries;

    public Dictionary(String[] entries) {
        this.entries = entries;
    }

    public boolean contains(String word) {
        return Arrays.asList(entries).contains(word);
    }

    public static Set<String> longestWord(String letters, Dictionary dict) {
        Set<String> result= new HashSet<>();
    String[] entries = dict.entries;
    int maxLength=0;
    Map<String,Integer> resultMap= new HashMap<>();


    for(String s: entries) {

            if (s.length() >= maxLength && findCharacters(letters,s)) {
                resultMap.put(s, s.length());
                maxLength = s.length();
            }
        }

        for(Map.Entry<String,Integer> entry: resultMap.entrySet()){
            if(entry.getValue()==maxLength){
                result.add(entry.getKey());
            }
        }
       return  result;

    }

static boolean findCharacters(String letters,String s){
        boolean flag= true;
        for(char c:s.toCharArray())
        {
            if(letters.indexOf(c)==-1){
                flag= false;
                break;
            }
        }
        return flag;
}


    public static boolean pass() {
        Dictionary dict = new Dictionary(new String[] {"to", "banana", "toe", "toes", "dogs", "ababcd", "elephant"});
        boolean r = new HashSet<String>(Arrays.asList("toes","dogs")).equals(longestWord("ogtdes", dict));
        return r;
    }

    public static void main(String[] args) {
        if(pass()) {
            System.out.println("Pass");
        } else {
            System.err.println("Fails");
        }
    }
}
