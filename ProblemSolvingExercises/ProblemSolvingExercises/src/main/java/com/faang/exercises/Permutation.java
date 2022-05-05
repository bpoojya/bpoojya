package com.faang.exercises;


public class Permutation {
    public static void main(String args[]){
        permuatate("123",0,2);
    }
    static void permuatate(String input,int left,int right){
        if(left==right){
            System.out.println(input);
            return;
        }
        for(int i=left;i<=right;i++ ){
           input= swap(input,left,i);
           permuatate(input,left+1,right);

        }
    }
    static String swap(String input,int left, int right){
        char ch[]=input.toCharArray();
        char temp= ch[right];
        ch[right]=ch[left];
        ch[left]=temp;
        return new String(ch);
    }
}
