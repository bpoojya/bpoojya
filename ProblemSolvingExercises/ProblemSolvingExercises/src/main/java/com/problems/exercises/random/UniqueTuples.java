package com.problems.exercises.random;

import java.util.HashSet;

public class UniqueTuples{
        public static HashSet<String> uniqueTuples(String input, int len ) {

            HashSet<String> result = new HashSet<String>();
           for(int i=0;i<input.length()-1;i++){
               String sub= input.substring(i,i+len);
               if (!result.contains(sub)){
                   result.add(sub);
               }
           }

            return result;
        }

        public static void main( String[] args ) {
            String input = "aab";
            HashSet<String> result = uniqueTuples( input, 2 );
            if( result.contains( "aa" ) && result.contains( "ab" ) ) {
                System.out.println( "Test passed." );

            } else {
                System.out.println( "Test failed." );

            }
        }
}
