package com.dsa.practice.matrices;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix extends BaseMatrix{
   /* Given an m x n matrix of integers matrix, return a list of all elements within the matrix in spiral order*/
 /*   matrix = [[1,2],[3,4]]
    Output: [1,2,4,3]
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    [1,2,3,6,9,8,7,4,5]
  */

     public static void main(String[] args) {

         SpiralMatrix matrix = new SpiralMatrix();
         final List<Integer> result = matrix.spiralOrder(new Integer[][]
                 {{1,2,3},{4,5,6},{7,8,9}
                 });

         System.out.println( result);

    }

    public List<Integer> spiralOrder(Integer[][] matrix) {

        final List<Integer> result = new ArrayList<>();

        int ROWS = matrix.length;
        int COLS  = matrix[0].length;


        /** again idea is traverse in layers **/

        int top = 0;
        int bottom = ROWS-1;

        int left = 0;
        int right = COLS-1;
        //left to right, top to bottom, right to left, bottom to top

        while(left <=right && top<=bottom){

            for( int i = left; i<=right;i++ ){
                result.add(matrix[top][i]);
            }
            top++;

            if(top>bottom) break;

            for(int j=top; j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(right<left) break;

            for(int i=right;i >=left ;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            for(int j=bottom;j >=top ;j--){
                result.add(matrix[j][left]);
            }
            left++;

        }

        return result;
    }

}
