package com.faang.exercises;

public class RemoveCharactersRecursively {
    public static void main(String args[]) {
        System.out.println(removeChars(new char[]{'a', 'b', 'c', 'a', 'd', 'x'}, 6, 'a', 0 ));
    }

    static char[] removeChars(char input[],int n,char target, int start) {
        if (input[start]=='\0') {
            return input;
        }
        if (input[start] == target) {
          for(int i=start;i<n-1;i++){
              input[i]=input[i+1];
          }
input[n-1]='\0';
        }

         return     removeChars(input, n , target,start+1);






    }
}
