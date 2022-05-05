package com.problems.exercises.strings;

public class ReverseString {

    public static String reverseStr( String str ){
       char[] output=new char[str.length()];
       char[] ch= str.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
          output[output.length-1-i]=ch[i];
       }
       return new String(output);
    };


    public static void main(String[] args){

        String testString;
        String solution;
        boolean result = true;

        result = result && reverseStr("abcd").equals("dcba");

        if(result){
            System.out.println("All tests pass");
        }
        else{
            System.out.println("There are test failures");
        }

    }
}
