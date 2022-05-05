package com.problems.exercises.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String args[]){
        Arrays.stream(mergeArrays(new int[]{3,4,7},new int[]{1,2,9})).forEach(s->System.out.println(s));
    }

    static  int[] mergeArrays(int[] array1,int[] array2) {
        int reult[] = new int[array1.length + array2.length];
        int i=0; int j=0; int k=0;
        while(i<array1.length && j< array2.length){

                if(array2[j]<=array1[i]){
                   reult[k]=array2[j];
                   k++;
                   j++;

                }
                else{
                    reult [k]=array1[i];
                    k++;
                    i++;
                }


        }
        if(j<array2.length){
            while(j<array2.length){
                reult[k]=array2[j];
                j++;
                k++;
            }
        }
        if(i<array1.length){
            while(i<array1.length){
                reult[k]=array1[j];
                i++;
                k++;
            }
        }

        return reult;
    }
}
