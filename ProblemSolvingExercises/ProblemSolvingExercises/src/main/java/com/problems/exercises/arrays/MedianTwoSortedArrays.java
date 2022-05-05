package com.problems.exercises.arrays;


public class MedianTwoSortedArrays {
    public static double logic(int[] A, int[] B) {
        double median=0.0;
        int result[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        int index = 0;
        while (i != A.length && j != B.length) {
            if (A[i] <= B[j]) {
                result[k] = A[i];
                i++;

            } else {
                result[k] = B[j];
                j++;
            }
            k++;
        }
        if (i == A.length) {
            index = j;
            for (int p = index; p < B.length; p++) {
                result[k] =B[p];
                k++;
            }

        }
        else{
            index = i;
            for (int p = index; p < A.length; p++) {
                result[k] =A[p];
                k++;
            }


        }
        if(result.length%2==0){
            double v1= result[(result.length/2)-1];
            double v2= result[result.length/2];
            return (v1+v2)/2;
        }
        else{
           return result[result.length/2];
        }
    }

    public static boolean pass()
    {
        boolean result = true;
        result = result && logic(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
        return result;
    };

    public static void main(String[] args)
    {
        if(pass())
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("some failures");
        }
    }
}
