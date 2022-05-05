package com.problems.exercises.random;

import java.util.Arrays;

public class SmallestNumber {
    public static int FindMin(int a[])
    {
        Arrays.sort(a);

        return a[0];
    }

    public static void main(String args[])
    {
        boolean result = true;
        result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
        result = result && FindMin(new int[]{2,1}) == 1;
        result = result && FindMin(new int[]{1}) == 1;

        try {
            FindMin(null);
            result = false;
        }
        catch(Exception e)
        {
            result = result && true;
        }

        if(result)
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("There are test failures");
        }
    }
}
