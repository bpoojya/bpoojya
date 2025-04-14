package com.faang.exercises;

import java.util.*;

public class ParanthesesPermutations {


    public static void main(String args[]) {

        System.out.print(permuteUnique(new int[]{1,1,2}));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subSet(nums, 0, ans, list);
        return ans;
    }

    public static  void subSet(
            int[] nums,
            int idx,
            List<List<Integer>> ans,
            List<Integer> list
    ) {
        if(idx==nums.length) {ans.add(new ArrayList<>(list)) ;return;}

        for (int i = idx; i < nums.length; i++) {
            //skip the duplicate elements
            if (i > idx && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            subSet(nums, i , ans, list);
            list.remove(list.size() - 1);
        }
    }
}


