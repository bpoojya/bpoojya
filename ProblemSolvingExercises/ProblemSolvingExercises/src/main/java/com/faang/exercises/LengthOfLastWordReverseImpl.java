package com.faang.exercises;

public class LengthOfLastWordReverseImpl {
    public static void main(String args[]){
        System.out.println(calculateLength("This     is the    World   "));
    }
    static int calculateLength(String input) {
        int i=input.length()-1;
        int count=0;
        while(i>=0){
            if(input.charAt(i)==' ' ) {
                if (i == input.length() - 1) {
                    while (input.charAt(i) == ' ' && i >= 0) {
                        i--;

                    }
                } else {
                    break;
                }
            }
                else{
                    count++;
                    i--;
                }



        }
        return  count;
    }
}
