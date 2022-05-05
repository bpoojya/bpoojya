package com.problems.exercises.random;

public class IndexOfSubstring {
    public static void main(String args[]){
        System.out.println(searchInsert(new int[]{3,5,7,9,10},8));
    }
    public static int searchInsert(int[] nums, int target) {


            int low=0; int mid=nums.length/2; int high= nums.length-1;
                if(target<=nums[0]){return 0;}
                if(target>nums[nums.length-1]) return nums.length;


            while(low<high){
                if(target==nums[mid]){
                    return mid;
                }
                if(target<nums[mid]){
                    high=mid;
                    mid=(low+mid)/2;
                }
                if(target>nums[mid]){
                    low=mid+1;
                    mid=(mid+high)/2;
                }
            }
         if(low>mid) return mid+1;
         else return mid;

        }


}
