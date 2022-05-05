package com.problems.exercises.random;

public class BuyAndSellStock {
    public static void main(String args[]){
        System.out.println(calculate(new int[]{7,1,5,3,6,4}));
    }

    static int  calculate(int[] array){
       int buyingPrice=array[0];
       int profit=0;
        for(int i=0;i<array.length;i++){
           if(array[i]<buyingPrice){
               buyingPrice=array[i];

           }
           if(array[i]-buyingPrice>profit){
               profit=array[i]-buyingPrice;
           }
        }

        return profit;
    }
}
