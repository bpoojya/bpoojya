package com.dsa450.Arrays.helpers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapSort {
    public static void main(String args[]){
        Arrays.stream(heapSort(new int[]{12, 11, 13, 5, 6, 7})).forEach(s->System.out.println(s));
    }
    static int[] heapSort( int [] array){
        int n=array.length;


        for (int i = 0; i <=n/2-1; i++){
           heapify(array, i,n);

       }

        Arrays.stream(array).forEach(s->System.out.println(s));
       for(int i=n-1;i>0;i--) {
           int temp = array[0];
           array[0] = array[i];
           array[i] = temp;
           heapify(array, 0, i);
       }

        return array;


    }

   public static void heapify(int[] array, int i ,int n){

        int largest=i;
        int left= 2*i+1;
        int right =2*i+2;

        if(left<n && array[largest]<array[left]){
            largest=left;
        }
        if(right<n && array[largest]<array[right]){
            largest=right;
        }
        if(largest!=i){
            int temp= array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapify(array, largest,n);

        }



    }
}
