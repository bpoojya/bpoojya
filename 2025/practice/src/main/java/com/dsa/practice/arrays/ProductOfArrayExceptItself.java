package com.dsa.practice.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    /**
     * Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
     *
     * Each product is guaranteed to fit in a 32-bit integer.
     *
     * Follow-up: Could you solve it in
     * O
     * (
     * n
     * )
     * O(n) time without using the division operation?
     *
     * Input: nums = [1,2,4,6]
     *
     * Output: [48,24,12,8]
     */

    public static void main(String[] args) {
        ProductOfArrayExceptItself product = new ProductOfArrayExceptItself();
       Arrays.stream(product.calulateProduct(new int[]{1,2,4,6})).forEach(System.out::println);
    }

    private int[] calulateProduct(int [] input){
       int[] result = new int[input.length];
       int prefix = 1;
       //calculate prefix forward traversal
        for(int i = 0; i<input.length ;i++){
            result[i] = prefix;
            prefix = prefix * input[i];
        }
        // 48, ,24, 12, 8


        //calculate postfix backward traversal
        int postfix = 1;
        for(int i = input.length -1 ; i>=0; i--){
            result[i] = postfix * result[i];
            postfix = postfix * input[i];
        }

        return result;




    }
}
