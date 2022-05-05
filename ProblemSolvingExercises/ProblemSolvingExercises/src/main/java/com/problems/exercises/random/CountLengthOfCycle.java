package com.problems.exercises.random;

public class CountLengthOfCycle {
    public static int countLengthOfCycle( int[] arr, int startIndex ) {
        int returnValue=-1;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==startIndex)
              returnValue=i+1;
      }

        return returnValue;
    }



    public static void main( String[] args ) {

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;

        if(testsPassed) {
            System.out.println( "Test passed." );
            //return true;
        } else {
            System.out.println( "Test failed." );
            //return false;
        }


    }
}
