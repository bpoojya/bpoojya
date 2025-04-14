package com.faang.exercises;

import java.util.ArrayList;
import java.util.List;

public class FindAllsubSetArray {
   static List<List<Integer>> output= new ArrayList<>();

    public static void main(String args[]){
        subsets(new int[]{1,2,3});

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list= new ArrayList<>();
        generateSets(nums,0,list,output);
        return output;


    }

   static void generateSets(int[]nums, int index,List<Integer> list,List<List<Integer>> output){
        if(index==nums.length){
            output.add(new ArrayList<>(list));
            return;

        }
        generateSets(nums,index+1,list,output);
        list.add(nums[index]);
        generateSets(nums,index+1,list,output);
        list.remove(list.size()-1);






    }
}