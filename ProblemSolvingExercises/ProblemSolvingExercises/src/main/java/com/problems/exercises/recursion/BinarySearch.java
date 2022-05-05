package com.problems.exercises.recursion;

public class BinarySearch {
    public  static  void main(String args[]){
        System.out.println(isPresent(new int[]{3,6,9,10,11,53,54}, 0, 6, 10));
    }

    static  boolean isPresent(int[] input, int start, int end, int target){
       boolean value= false;
          if(start<end) {
              int mid = (start + end) / 2;
              if (input[mid] == target) {
                  value = true;
              } else if (input[mid] < target) {
                  value = isPresent(input, mid + 1, end, target);
              } else if (input[mid] > target) {
                  value = isPresent(input, start, mid, target);
              }
          }

      return  value;

    }

}
