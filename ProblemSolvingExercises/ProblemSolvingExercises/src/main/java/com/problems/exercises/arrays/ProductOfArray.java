package com.problems.exercises.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArray {
    public static  void main(String args[]){
        Arrays.stream(calculateProduct(new int[]{1,2,3,4})).forEach(s->{
            System.out.println(s);
        });
    }

    static int[] calculateProduct(int [] array){
        int productArray[]= new int[array.length];

          productArray[0]=1;
        for(int i=1;i<array.length;i++){
           productArray[i]=productArray[i-1]*array[i-1];
        }
      int rightproduct=1;
        for(int j=array.length-2;j>=0;j--){
            rightproduct*=array[j+1];
            productArray[j]=productArray[j]*rightproduct;

        }
       return  productArray;
    }
}
