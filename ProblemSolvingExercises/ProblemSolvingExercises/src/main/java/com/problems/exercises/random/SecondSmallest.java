package com.problems.exercises.random;

import java.util.Arrays;

public class SecondSmallest {
    static int secondSmallest(int[] a){
        Arrays.sort(a);
      if(a.length<2) return 0;
    else return a[1];
}

    public static void main(String args[]) {

        int[] a = { 0 };
        int[] b = { 0, 1 };

        boolean result = true;
        result &= secondSmallest(a) == 0;
        result &= secondSmallest(b) == 1;

        if (result) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
