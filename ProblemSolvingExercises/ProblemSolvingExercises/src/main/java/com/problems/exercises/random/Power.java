package com.problems.exercises.random;

public class Power {
    /* Given base and integer exponent, compute value of base raised to the power of exponent.
     */
    public static double power(double base, int exp) {
        double result=1;
        for(int i=1;i<=exp;i++){
            result=result*base;
        }
        return result;
    }

    public static boolean doTestPass() {
        boolean testsPass = true;
        double result = power(2,2);
        double result2= power(3,4);
        return testsPass && result==4 && result2==81;
    }

    public static void main( String[] args ) {
        if(doTestPass()){
            System.out.println("Pass");
        }
        else{
            System.out.println("There are failures");
        }
    }
}
