package com.problems.exercises.arrays;

import java.util.Arrays;

/**
 * Given an array put the values in the order such that arr[i]==i when index value not found its -1
 * time O(n^2) space O(1)
 */

public class IndexArray {
    public static void main(String args[]){
        Arrays.stream(indexArray(new int[]{8, -1, 6, 1, 9, 3, 2, 7, 4, -1})).forEach(s->System.out.println(s));
    }

    static int[] indexArray(int[] array){


        for(int i=0;i<array.length;i++){
            while(array[i]!=i &&array[i]!=-1){
                // itr1 { 4,-1 6,1,9,3,2,7,8,-1}-->{ 9,-1 6,1,4,3,2,7,8,-1}-->{ -1,-1 6,1,9,3,2,7,8,-9}

                int temp= array[i];
                array[i]= array[temp];
                array[temp]=temp;

            }



        }
        return  array;

    }
}
