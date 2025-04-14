package com.faang.exercises;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubArrays {
    static List<List<Integer>> output = new ArrayList<>();

    public static void main(String args[]) {
        subArrays(new int[]{1, 2, 3});

    }

    public static List<List<Integer>> subArrays(int[] nums) {
        List<Integer> list = new ArrayList<>();
        generateSets(nums, 0,  output);
        return output;


    }

    static void generateSets(int[] nums, int index, List<List<Integer>> output) {
        if (index >= nums.length) {
            return;

        }
        List<Integer> list= new ArrayList<>();
       for(int i=index;i<nums.length;i++){
           list.add(nums[i]);
           output.add(new ArrayList<>(list));
       }

       generateSets(nums,index+1,output);



    }

}
