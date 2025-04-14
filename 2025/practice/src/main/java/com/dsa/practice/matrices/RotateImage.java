package com.dsa.practice.matrices;

public class RotateImage <T> extends  BaseMatrix{
    //The idea is to  rotate counter clockwise by swapping elements, make sure to store one element to swap last one,
    //one outer layer is finished, move on to the inner layer by shrinking the pointers
    //every layer requires range- 1 swaps, you can also achieve this by applying tanspose+reverse of the matrix

public static void main(String args[]){
    RotateImage classImage = new RotateImage();


/*
    classImage.rotateImage(new Integer[][]{{
            1,2,3,},
            {4,5,6},
            {7,8,9}
});


    classImage.rotateImage(new Character[][]{{
             'a' , 'b' , 'c'},
            {'d' , 'e' , 'f'},
            {'g' , 'h' , 'i'}
    });
*/



    classImage.rotateImageByTranspose(new Integer[][]{{
            1,2,3,},
            {4,5,6},
            {7,8,9}
});


    classImage.rotateImageByTranspose(new Character[][]{{
             'a' , 'b' , 'c'},
            {'d' , 'e' , 'f'},
            {'g' , 'h' , 'i'}
    });


}



    public <T> void rotateImage( T[][] input) {
        if (input.length > 0 && input[0].length > 0) {
            System.out.println("Input array serialized is: " + printArray(input));
            rotateInput(input);
            System.out.println("Input array rotated serialized is: "+printArray(input));

        }
    }


    public <T> void rotateImageByTranspose( T[][] input) {
        if (input.length > 0 && input[0].length > 0) {
            System.out.println("Input array serialized is: " + printArray(input));
            rotateByTranspose(input);
            System.out.println("Input array rotated serialized is: "+printArray(input));

        }
    }

    private <T> void rotateInput(T[][] input){
        int left = 0;
        int right = input[0].length-1;
        int top = 0;
        int bottom = input.length -1;
        T temp =null;

        while(left<right){
            top = left;
            bottom = right;
            for(int i=left;i<right-left;i++) {

                temp = input[top][left+i];
                input[top][left+i] = input[bottom-i][left];

                input[bottom-i][left] = input[bottom][right-i];

                input[bottom][right-i] = input[top+i][right];

                input[top+i][right] = temp;

            }

                right--;
                left++;



            }

        }

    private <T> void rotateByTranspose( T [][] input){
            for(int i = 0; i< input.length;i++){
                for(int j = i; j<input.length;j++){
                  if(i !=j) {
                     T temp = input[i][j];
                      input[i][j] = input[j][i];
                      input[j][i] = temp;

                  }
                }
            }
        System.out.println("Matrix after transpose"  + printArray(input));

        for(T[] row : input){
            for(int i =0; i<input.length/2;i++){
                T temp = row[i];
                row[i] = row[input.length-1];
                row[input.length-1] = temp;

            }
        }
        System.out.println("Matrix after rotation"  + printArray(input));

    }





}
