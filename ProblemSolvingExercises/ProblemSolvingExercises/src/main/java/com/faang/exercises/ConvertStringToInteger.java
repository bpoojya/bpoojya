package com.faang.exercises;

public class ConvertStringToInteger {
    public static void main(String args[]){
        System.out.println(convertInteger("12345"));
    }

    static int convertInteger(String input){
        if(input.length()==0){
            return 0;
        }
        int smallAns= convertInteger(input.substring(0,input.length()-1));
        //calc
        return smallAns*10+( input.charAt(input.length()-1)-'0');
    }
}
