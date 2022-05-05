package com.faang.exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationIntegers {
    public static void main(String args[]){
        permuatate(new int[]{1,2,3,4},0,3);
    }
    static void permuatate(int[] input,int left,int right){
        if(left==right){
            for(int k:input){
                System.out.print(k);
            }
            System.out.print('\n');
            return;
        }
        for(int i=left;i<=right;i++ ){
            input= swap(input,left,i);
            permuatate(input,left+1,right);
            input=swap(input,left,i);

        }
    }
    static int[] swap(int[] input,int left, int right){
        // char ch[]=input.toCharArray();
        int temp= input[right];
        input[right]=input[left];
        input[left]=temp;
        return input;
    }
}
