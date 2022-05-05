package com.faang.exercises;
//duplicate consective characters replace
public class ReplaceCharactersRecursion {
    public static void main(String args[]) {
        System.out.println(replaceCharacters(new char[]{'a','a', 'b','b','b' ,'c', 'a','a' ,'d','d', 'x'}, 11, 0 ));
    }

    static char[] replaceCharacters(char input[],int n, int start) {
        if (input[start]=='\0') {
            return input;
        }
        if (input[start] == input[start+1]) {
          for(int i=start;i<n-1;i++){
              input[i]=input[i+1];
          }
        input[n-1]='\0';
            return replaceCharacters(input,n-1,start);
        }
else {
            return replaceCharacters(input, n, start + 1);
        }






    }
}
