package com.problems.exercises.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two sum problem -- Find the pair of indices in the array which is equal to the target sum
 * Time O(n), space O(n) using Hash map
 */

public class ArraySumwithMap {
public static void main(String args[]){
   Arrays.stream(calculateSum(new int[]{6, 3, 7, 8, 9, 2}, 11)).forEach(s->{
        System.out.println(s);
    });
}
static int[] calculateSum(int [] array, int target){
    Map<Integer,Integer> testMap= new HashMap<>();
    int[] newInt= new int[2];
    for(int i=0;i< array.length;i++) {
        if (!testMap.containsKey(array[i])) {
            testMap.put(target - array[i], i);
        } else {
            newInt[0] = testMap.get(array[i]);
            newInt[1] = i;
            break;
        }
    }
   return  newInt;
}
}
