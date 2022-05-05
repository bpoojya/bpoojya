package com.problems.exercises.random;

public class PascalTriangle {
    public static  int pascal(int col, int row){

      return binomialCoeff(row,col);
    }
    static int binomialCoeff(int i, int j){
        int result=1;
        if(j>i-j){
            j=i-j;
        }
        for(int k=0;k<j;++k){
            result=result*(i-k);
            result=result/(k+1);
        }
        return result;
    }

    public static void main(String[] args) {
        if(PascalTriangle.pascal(0,0) ==  1 &&
                PascalTriangle.pascal(1,2) ==  2 &&
                PascalTriangle.pascal(5,6) ==  6 &&
                PascalTriangle.pascal(4,8) ==  70 &&
                PascalTriangle.pascal(6,6) ==  1) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
    }
}
