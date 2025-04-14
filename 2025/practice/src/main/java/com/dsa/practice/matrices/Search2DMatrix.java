package com.dsa.practice.matrices;

public class Search2DMatrix {

    /**
     * You are given an m x n 2-D integer array matrix and an integer target.
     *
     * Each row in matrix is sorted in non-decreasing order.
     * The first integer of every row is greater than the last integer of the previous row.
     * Return true if target exists within matrix or false otherwise.
     *
     * Can you write a solution that runs in O(log(m * n)) time?
     */

    /**
     * matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
     * output true
     */

    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        boolean result= search2DMatrix.binarySearchRowsAndCols(new int[][]{
                {1,2,4,8},{10,11,12,13},{14,20,30,40}
        }, 10);

        System.out.println(result);

    }

    private boolean mPlusNSearch(int[][] matrix, int target){
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int r = 0;
        int c = COLS-1;

        while(r<ROWS && c>=0){
            if(matrix[r][c] <target){
                r++;
            }
            else if(matrix[r][c] >target){
                c--;
            }
            else return true;
        }

        return false;
    }

    private boolean binarySearchOnMatrix(int[][] matrix, int target){

        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int N = ROWS*COLS;

        int low = 0;
        int high = N-1;

        while(low<=high){
            int mid = (low+(high-low)/2);

            //width of the matrix matters here

            int r = mid/COLS;
            int c =mid%COLS;

            int currVal  = matrix[r][c];
            if(currVal == target){
                return true;
            }

            else if(currVal <target){
                low= mid+1;

            }
            else high = mid-1;


        }
return  false;

    }

    private boolean binarySearchRowsAndCols(int[][] matrix, int target){

        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bottom =ROWS -1;
        int mid = 0;

        while(top<=bottom) {
             mid = (top + bottom) / 2;

            if (target < matrix[mid][0]) {
                bottom = mid -1 ;

            } else if (target > matrix[mid][COLS-1]) {
                top = mid + 1;

            } else {
                break;
            }
        }
        if(top>bottom) return false;

        int left = 0;
         int right = COLS -1;

         int row = mid;

         while(left<=right) {
             int col = (right + left) / 2;

             if (matrix[row][col] > target) {
                 right = col - 1;
             } else if (matrix[row][col] < target) {
                 left = col + 1;
             } else return true;
         }

        return  false;

    }
}
