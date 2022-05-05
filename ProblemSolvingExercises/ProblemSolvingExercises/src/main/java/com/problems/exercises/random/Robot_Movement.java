package com.problems.exercises.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Robot_Movement {

    public static Integer[] walk( String path ) {
        Integer result[] = {0, 0};
        if (path.split(" ").length == 1) {
            for (int i = 0; i < path.length(); i++) {
                result= getValue(path.substring(i,i+1),result);
            }
        } else {
            for (String s : path.split(" ")) {
               result= getValue(s,result);

            }
        }
        return result;
    }

     static Integer [] getValue(String s, Integer [] a){
        if(s.equals("UP") || s.equals("U")){
           ++ a[1];

        }
         else if(s.equals("DOWN") || s.equals("D")){
             a[1]--;

         }
         else if(s.equals("LEFT") || s.equals("L")){
             a[0]--;

         }
         else if(s.equals("RIGHT") || s.equals("R")){
             a[0]++;

         }
         return a;
     }

    public static boolean isEqual(Integer[] a, Integer[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean pass() {
        boolean res = true;

        {
            String test = "UUU";
            Integer[] result = walk(test);
            res &= isEqual(result, new Integer[]{0, 3});
        }

        {
            String test = "ULDR";
            Integer[] result = walk(test);
            res &= isEqual(result, new Integer[]{0, 0});
        }

        {
            String test = "ULLLDUDUURLRLR";
            Integer[] result = walk(test);
            res &= isEqual(result, new Integer[]{-2, 2});
        }

        {
            String test = "UP LEFT DOWN DOWN RIGHT RIGHT UP UP";
            Integer[] result = walk(test);
            res &= isEqual(result, new Integer[]{1, 1});
        }

        return res;
    }

    public static void main(String[] args) {
        if(pass()){
            System.out.println("Pass");
        } else {
            System.out.println("Test failures");
        }
    }
}
