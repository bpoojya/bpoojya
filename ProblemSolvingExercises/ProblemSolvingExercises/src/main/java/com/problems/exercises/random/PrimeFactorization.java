package com.problems.exercises.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrimeFactorization {

    public static List<Integer> primeFactorization(int x) {
        List<Integer> result = new ArrayList<>();
        List<Integer> finalResult= new ArrayList<>();
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                result.add(i);
            }
        }
        for(int j:result){
            if(isPrime(j)){
               finalResult.add(j);
            }
        }
        return finalResult;
    }
    static boolean  isPrime(int j){
        boolean flag= true;
        for(int i=2;i<j;i++){
            if(j%i==0){
                flag=false;
                break;
            }
            else{
               continue;
            }
        }
        return flag;
    }

    public static void main(String args[])
    {

        System.out.println(primeFactorization(6) + " " + primeFactorization(5));
        if(primeFactorization(6).equals(Arrays.asList(2,3))
                &&
                primeFactorization(5).equals(Arrays.asList(5))
        ) {
            System.out.println("All passed");
        }else {
            System.out.println("Failed");
        }

    }
}
