package com.problems.exercises.arrays;

import java.util.Arrays;

/**
 * Move all the zeros in the array to the end of the array
 * Time O(n) and space O(1)
 */

public class MoveZerosToTheEnd {
    public static  void main(String args[]){
        Arrays.stream(moveZeros(new int[]{1,0,2,3,0,4,5,0})).forEach(s->System.out.println(s));
    }


    static int[] moveZeros(int[] array){

       int readIndex=0;
       int writeIndex=0;
       while(readIndex!=array.length){
           if(array[readIndex]!=0){
               array[writeIndex]=array[readIndex];
               writeIndex++;
           }
           readIndex++;
       }
    for(int i=writeIndex;i<readIndex;i++){
        array[i]=0;
    }

        return array;
    }
}
