package com.problems.exercises.random;

public class StairCase {
    public static Integer countSteps(Integer n){
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

          for(int i=3;i<=n;i++){
        res[i]=res[i-1]+res[i-2]+res[i-3];
    }
    return res[n];
}

    public static boolean doTestsPass()
    {
        return countSteps(3) == 4
                && countSteps(4) == 7;
    }

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
