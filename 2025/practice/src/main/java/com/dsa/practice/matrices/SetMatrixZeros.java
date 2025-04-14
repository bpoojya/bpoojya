package com.dsa.practice.matrices;

/*
Given an m x n matrix of integers matrix, if an element is 0, set its entire row and column to 0's.

        You must update the matrix in-place.

        Follow up: Could you solve it using O(1) space?
*/
/*
Input: matrix = [
        [1,2,3],
        [4,0,5],
        [6,7,8]
        ]

        Output: [
        [1,0,3],
        [0,0,0],
        [6,0,8]
        ]
        */

// the idea is to suse the first row and first cold to store any futher rows that have zero with an exception of 00 row, you mark this zero only for first col


public class  SetMatrixZeros extends  BaseMatrix{

    public static void main(String args[]){
        SetMatrixZeros matrixZeros = new SetMatrixZeros();
        matrixZeros.setMatrixZeros(new Integer[][]{
                {1,0,2,3},
        {4,6,9,5},
        {11,15,13,18}
        });


       matrixZeros.setMatrixZeros(new Integer[][]{
        {1,2,3},
        {4,0,5},
        {6,7,8}
    });
}



    private boolean rowZero =  false;



    private void setMatrixZeros(Integer[][] input){
        System.out.println("Input Matrix before setting to zero: " + printArray(input));

        markFirstRowCol(input);
        findZeros(input);
        markFirstCols(input);
        adjustRowZero(input);

        System.out.println("Output Matrix after: "+ printArray(input));


    }

    private void markFirstRowCol(Integer[][] input){
        for(int i = 0; i<input.length; i++){
            for(int j = 0;j< input[0].length;j++){
                if(input[i][j] == 0){
                    input[0][j] = 0;
                   // is any other element in first row zero, then dont mark it, make boolean variable true, because if 00 cell is marked for row zero that col
                    //becomes zero which is undesirable

                    if(i>0) input[i][0] = 0;
                    else rowZero = true;
                }
            }
        }
    }

    private void findZeros (Integer[][] input){
        for(int i = 1; i< input.length; i++){
                for(int j=1;j< input[0].length; j++){
                    if(input[i][0] ==0 || input[0][j] ==0){
                        input[i][j] = 0;
                }
            }
        }
    }

    private void markFirstCols(Integer[][] input){
        if(input[0][0] == 0){
            for(int i=1;i< input.length;i++){
                input[i][0] =0;
            }
        }
    }

    private void adjustRowZero(Integer[][] input){
        if(rowZero){
            for(int j=0; j<input[0].length; j++){
                input[0][j] =0;
            }
        }
    }

}
