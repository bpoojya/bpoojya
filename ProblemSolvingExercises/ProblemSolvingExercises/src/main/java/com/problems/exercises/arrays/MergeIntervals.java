package com.problems.exercises.arrays;

import java.util.Arrays;

public class MergeIntervals {
    public static  void main(String args[]){
        Arrays.stream(mergeIntervals(new int[][]{{10,12},{12,15}})).forEach(s->System.out.println(s));
    }

    static int[] mergeIntervals(int[][] array){
        int [] output= new int[2];
        int min=array[0][0];
        int max=array[0][1];
        for(int i=0;i<array.length;i++){
          if(array[i][0]<=max){
              max=Math.max(max,array[i][1]);
          }
        }
        output[0]=min;
        output[1]=max;
        return output;
    }
 }
