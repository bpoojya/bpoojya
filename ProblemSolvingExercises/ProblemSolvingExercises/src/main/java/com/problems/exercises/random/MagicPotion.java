package com.problems.exercises.random;

import java.util.ArrayList;
import java.util.List;

public class MagicPotion {
    private static int minimalSteps( String ingredients )
    {
       StringBuilder resultString= new StringBuilder();
       StringBuilder subString= new StringBuilder();
       char c1[]=ingredients.toCharArray();
       for(char c:c1){
          if(resultString.indexOf(String.valueOf(c))==-1){
                resultString.append(c);
           }
           else{
               subString.append(c);
              if(resultString.indexOf(subString.toString())>-1) {
                  if(resultString.toString().charAt(resultString.length()-1)!='*')
                  resultString.append('*');
              }
           }
       }
       return resultString.length();

    }



    public static void main( String[] args )
    {

//        if (   minimalSteps("ABCDABCE") == 6 && minimalSteps("ABCABCE") == 5
//        && minimalSteps("ABCABCEA")==6 && minimalSteps("abbbbabbbb")==5)
       if(minimalSteps("abbbbabbbb")==5)
        {
            System.out.println( "Pass" );
        }
  else
        {
            System.out.println( "Fail" );
        }
    }
}
