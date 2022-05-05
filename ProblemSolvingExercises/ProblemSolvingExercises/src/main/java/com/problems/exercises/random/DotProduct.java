package com.problems.exercises.random;

public class DotProduct {

    /**
     *
     * Given two arrays of integers, returns the dot product of the arrays
     */

    public static int dotProduct( int[] array1, int[] array2 ) {
        int sum=0;
       for(int i=0;i<array1.length;i++){

               sum=sum+array1[i]*array2[i];

       }
       return  sum;
    }

    public static void main( String[] args ) {
        int[] array1 = { 1, 2 };
        int[] array2 = { 2, 3 };
        int result = dotProduct( array1, array2 );
        System.out.println( result );

        if( result == 8 ) {
            System.out.println( "Passed." );

        } else {
            System.out.println( "Failed." );

        }
    }
}
