package com.problems.exercises.random;

import java.util.*;


public  class PanagramDetector {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public String findMissingLetters(String sentence) {
           String result= "";
            boolean[] boolenArray= new boolean[26];
            String input= sentence.toUpperCase(Locale.ROOT);
            String output= ALPHABET.toUpperCase(Locale.ROOT);
            for( int i=0;i<input.length();i++){
               if('A'<=input.charAt(i)&&input.charAt(i)<='Z'){
                   boolenArray[input.charAt(i)-'A']=true;
               }

        }
            for(int i=0;i<boolenArray.length;i++){
                if(boolenArray[i]==false){
                    result=result+(char)(i+'A');
                }
            }
        return result.toLowerCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }
}

