package com.faang.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AllPossiblePalindromes {
    public static void main(String args[]) {


        printAllPossiblePalindromes("nitin", "");


    }


    static void printAllPossiblePalindromes(String input, String output){
        if(input.length()==0){
            System.out.println(output);
           return;
        }
        for(int i=0;i<input.length();i++){
            String prefix= input.substring(0,i+1);
            String res=input.substring(i+1);
            if(isPalindrome(prefix)){

                printAllPossiblePalindromes(res,output+"("+prefix+")");
            }

        }
    }
    static boolean isPalindrome(String input){
        int i=0; int n=input.length();
        while(i<n){
            if(input.charAt(i)!=input.charAt(n-1)){
                return  false;
            }
            i++;
        }
        return true;
    }
}
