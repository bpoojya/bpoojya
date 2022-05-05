package com.problems.exercises.random;

import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class FirstNonRepeating {
   static char returnValue= ' ';
    public static char findFirst(String input)
    {

       char[] c1= input.toCharArray();
      List<Character> list= new CopyOnWriteArrayList<>();
      for(Character c:c1){
          if(!list.contains(c)){
              list.add(c);
          }
          else{
              list.remove(c);
          }

      }

        return list.get(0);
    }

    public static void main(String args[])
    {

        String[] inputs = {"apple","racecars", "ababdc"};
        char[] outputs = {'a', 'e', 'd' };

        boolean result = true;

        for(int i = 0; i < inputs.length; i++ )
        {
            result = result && findFirst(inputs[i]) == outputs[i];
            if(!result)
                System.out.println("Test failed for: " + inputs[i]);
            else
                System.out.println("Test passed for: " + inputs[i]);
        }
    }

}
