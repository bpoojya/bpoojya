package com.faang.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class Validparanthesis {

    public static void main(String args[]){
      System.out.println( isValid("(])"));
    }
    public static boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(stack.size()!=0){
                char c= stack.peek();
                boolean comb1=s.charAt(i)==')'&& c=='(';
                boolean comb2=s.charAt(i)==']'&& c=='[';
                boolean comb3=s.charAt(i)=='}'&& c=='{';

                if(comb1||comb2||comb3)
                { stack.pop();}
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }


        if(stack.size()==0){
            return true;
        }
        else{
            return false;
        }

    }
}
