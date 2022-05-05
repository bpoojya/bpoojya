package com.problems.exercises.random;

public class AddFraction {
    public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
       int result[]= new int[2];
     result[1]=  fraction1[1]*fraction2[1];
     result[0]=(fraction1[0]*fraction2[1])+(fraction1[1]*fraction2[0]);
    return result;
    }


    public static void main( String[] args ) {
        int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

        if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
            System.out.println( "Test passed." );
        } else {
            System.out.println( "Test failed." );
        }
    }
}
