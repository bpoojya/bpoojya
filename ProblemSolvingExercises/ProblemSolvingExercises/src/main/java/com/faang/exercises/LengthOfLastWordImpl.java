package com.faang.exercises;

public class LengthOfLastWordImpl {
    public static void main(String args[]){
        System.out.println(calculateLength("This     is the    World   "));
    }
    static int calculateLength(String input) {
        int result=0; int i=0;
       while (i<input.length()){
            if(input.charAt(i)!=' '){
                ++result;
                ++i;
            }
            else{
                while(i<input.length()&&input.charAt(i)==' ') {
                  i++;
                }
                if(i==input.length()){
                    return result;
                }
                else{
                    result=0;
                }
            }
        }
        return result;
    }
}
