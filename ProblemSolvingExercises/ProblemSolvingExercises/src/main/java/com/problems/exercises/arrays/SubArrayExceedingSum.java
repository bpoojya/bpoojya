package com.problems.exercises.arrays;

public class SubArrayExceedingSum {

    public static int subArrayExceedsSum(int arr[], int target )
    {
        int counter=0;int sum=0;
        for(int i:arr) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > target) {
                    counter++;
                    break;
                } else continue;
            }
        }
        return counter>0?counter:-1;

    }

    /**
     * Execution entry point.
     */
    public static void main(String[] args)
    {
        boolean result = true;
        int[] arr = { 1, 2, 3, 4 };
        result = result && subArrayExceedsSum( arr, 6 ) == 2;
        result = result && subArrayExceedsSum( arr, 12 ) == -1;

        if( result )
        {
            System.out.println("All tests pass\n");
        }
        else
        {
            System.out.println("There are test failures\n");
        }
    }
}