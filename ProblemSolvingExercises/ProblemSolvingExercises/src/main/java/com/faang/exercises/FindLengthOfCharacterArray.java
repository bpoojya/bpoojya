package com.faang.exercises;

public class FindLengthOfCharacterArray {
    public static void main(String args[]) {
        char ch[]= new char[100];
        ch[0]='a';
        ch[1]='b';
        ch[2]='c';
        ch[3]='4';
       System.out.println(findLength(ch, 0,100));
    }
    static  int findLength(char[] input, int start, int n) {
        if(input[start]=='\0'){
            return 0;
        }
        return 1+ findLength(input,start+1,n-1);
    }


}
