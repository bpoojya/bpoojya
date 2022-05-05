package com.faang.exercises;


public class PermutationString2 {
    public static void main(String args[]){
        permuatate("123","");
    }
    static void permuatate(String input,String result){
      if(input=="") {
          System.out.println(result);
          return;
      }
          for(int i=0;i<input.length();i++){
              char ch= input.charAt(i);
              String prefix=input.substring(0,i);
           String rest= input.substring(i+1);
           permuatate(prefix+rest,result+ch);
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
