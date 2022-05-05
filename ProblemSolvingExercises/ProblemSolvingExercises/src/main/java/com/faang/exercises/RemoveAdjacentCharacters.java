package com.faang.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAdjacentCharacters {
    public static void main(String args[]) {
        System.out.println(removeAdjacentCharacters("MISSISSIPPIA"));
    }
    static String removeAdjacentCharacters(String input) {
        String output = "";
        Deque<Character> stack= new ArrayDeque<>();
        for(char c: input.toCharArray()){
           if(stack.size()!=0 && stack.peek()==c){
               stack.pop();
           }
           else{
               stack.push(c);
           }
        }
       while(stack.size()!=0){
           output=output+stack.removeLast();
       }
        return output;
    }



       /* int readCounter = 0;
        int writeCounter = 0;
        while (readCounter < input.length()) {
            if (output.isEmpty()) {
                output = output + input.charAt(0);
                readCounter++;
            } else {
                if (input.charAt(readCounter) != output.charAt(writeCounter)) {
                    output = output + input.charAt(readCounter);
                    writeCounter++;
                    readCounter++;
                } else {
                    output = output.substring(0, writeCounter);
                    writeCounter--;
                    readCounter++;
                }

            }

        }
        return output;
    }
    */

}
