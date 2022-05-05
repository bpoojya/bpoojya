package com.problems.exercises.random;

public class AtoI {
    public static int atoi(String str)
    {
        int result = 0;
        int strLength = str.length();

        for(int i = 0; i < strLength; i++)
        {
            result = result + str.charAt(i);
        }

        return result;
    };

    public static boolean pass()
    {
        boolean result = true;
        result = result && 123==atoi("123");
     //   result = result && (1 != 2);

        return result;
    };

    public static void main(String[] args)
    {
        if(pass())
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Some fail");
        }
    }
}
