package com.problems.exercises.random;

public class PowerOf10 {
    public static boolean isPowerOf10(int x)
    {
        double y= Math.log10(x);
        double z= Math.floor(y);
        double k=y-z;
        if(k==Double.valueOf(0)) return true;
        else return false;



    }

    public static boolean doTestsPass()
    {
        int[] isPowerList = {10};
        int[] isNotPowerList = {3};

        for(int i : isPowerList)
        {
            if(!isPowerOf10(i))
            {
                System.out.println("Test failed for: " + i);
                return false;
            }
        }

        for(int i : isNotPowerList)
        {
            if(isPowerOf10(i))
            {
                System.out.println("Test failed for: " + i);
                return false;
            }
        }

        System.out.println("All tested passed");
        return true;
    };


    public static void main(String args[])
    {
        doTestsPass();
    }
}

