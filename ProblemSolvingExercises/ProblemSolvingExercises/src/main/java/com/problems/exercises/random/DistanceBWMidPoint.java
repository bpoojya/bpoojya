package com.problems.exercises.random;

import java.util.Locale;

public class DistanceBWMidPoint {
    public static double shortestDistance(String document, String word1, String word2) {
        double shortest = document.length();
        String arr1[]= document.split(" ");
        String result="";
        int i=0;

        for(;i<arr1.length;i++){
          if(arr1[i].toLowerCase(Locale.ROOT).contains(word1.toLowerCase(Locale.ROOT))){
              break;
          }
        }
        for(int j=i;j<arr1.length;j++){
            if(!arr1[j].toLowerCase(Locale.ROOT).contains(word2.toLowerCase(Locale.ROOT)))
            result=result+" "+ arr1[j];
            else{
                result=result+" "+word2;
                break;
            }
        }
        result=result.trim();

      double value= result.length();
      return Math.ceil(value/2);


    }

    public static boolean pass() {
        return  shortestDistance(document, "we", "just") == 4d &&
                shortestDistance(document, "and", "graphic") == 6d &&
                shortestDistance(document, "transfer", "it") == 10d &&
                shortestDistance(document, "Design", "filler" ) == 16d ;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }

    private static final String document;
    static{
        StringBuffer sb = new StringBuffer();
        sb.append("Example we just made up");
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

        document = sb.toString();
    }
}
