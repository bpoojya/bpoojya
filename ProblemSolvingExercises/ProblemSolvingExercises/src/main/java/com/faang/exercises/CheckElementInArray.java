package com.faang.exercises;

public class CheckElementInArray {
    public static void main(String args[]) {
        System.out.println(checkElement(new int[]{1, 5, 6, 8}, 0, 4, 10));
    }
 /*   static  boolean checkElement(int input[], int start, int n, int target){
      if(n==0){
          return  false;
      }

        boolean isPresent=checkElement(input,start+1,n-1,target);
      if(isPresent){
          return true;
      }

            if(target==input[start]){
                return true;
            }
            else{
                return false;
            }


    }

  */

    static boolean checkElement(int input[], int start, int n, int target) {
        if (n == 0) {
            return false;
        }
        if (input[start] == target) {
            return true;
        }
        boolean isPresent = checkElement(input, start + 1, n - 1, target);
        return isPresent;

    }
}
