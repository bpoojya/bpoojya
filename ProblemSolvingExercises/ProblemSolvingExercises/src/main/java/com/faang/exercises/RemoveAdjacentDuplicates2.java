package com.faang.exercises;

//import javax.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAdjacentDuplicates2 {
  /*  public static void main(String args[]) {
        System.out.println(removeAdjacentCharacters("adddbbeeebcccffggg",3));
    }
    static String removeAdjacentCharacters(String input,int k) {
        String output = "";

      Deque<Pair<Character,Integer>> stack= new ArrayDeque<>();
        for(char c: input.toCharArray()){
           if(stack.size()==0) {
               stack.push(new Pair<>(c,1));
            }
           else{
              if(stack.peek().getKey()==c&&stack.peek().getValue()==k-1){
                  stack.pop();

              }
              else if(stack.peek().getKey()==c){
                Pair<Character,Integer> pair=stack.pop();
                int count= pair.getValue();
                Pair<Character,Integer> newPair= new Pair<>(pair.getKey(), count+1);
                stack.push(newPair);
                  }
              else{
                  stack.push(new Pair<>(c,1));
              }
           }
        }
int length= stack.size();
           for(int i=0;i<length;i++){
               Pair<Character,Integer> pair=stack.removeLast();
              int count= pair.getValue();
              while(count!=0){
                  output=output+pair.getKey();
                  count--;
              }
           }

        return output;
    }



    /*    int readCounter = 0;
        int writeCounter = 0;
        int j=0;
        while (readCounter < input.length()) {

            if (output.isEmpty()) {
                output = output + input.charAt(0);
                readCounter++;
            } else {

                if (input.charAt(readCounter) == output.charAt(writeCounter)) {
                    output = output + input.charAt(readCounter);
                    writeCounter++;
                    readCounter++;
                    j++;
                    if(j==k-1){
                        output = output.substring(0, writeCounter+1  - (k));//write counter -(k-1) and 1 incremented counter
                        writeCounter = writeCounter - (k);
                        j=0;
                    }

                } else {
                    j=0;
                    output = output + input.charAt(readCounter);
                    writeCounter++;
                    readCounter++;

                }
            }

        }
        return output;
    }
    */

}
