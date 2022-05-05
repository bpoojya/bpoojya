package com.problems.exercises.random;

public class SnowPack {
    public static Integer computeSnowpack(Integer[] arr)
    {
        Integer result=0;
        for(int i=1;i<arr.length-1;i++){
            int left=arr[i],right= arr[i];
            for(int j=0;j<i;j++){
                left=Math.max(left,arr[j]);
            }
            for(int j=i+1;j<arr.length-1;j++){
                right=Math.max(right,arr[j]);
            }
            result= result+Math.min(left,right)-arr[i];
        }
        return result;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass()
    {
        boolean result = true;
        result &= computeSnowpack(new Integer[]{0,1,3,0,1,2,0,4,2,0,3,0}) == 13;

        return result;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }
}
