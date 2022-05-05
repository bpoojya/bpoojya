package com.problems.exercises.random;

public class RemoveDuplicates {
    public static  void main(String args[]){
        System.out.println(removeDuplicates(new int[]{1,1,2,2}));
    }
        public static int removeDuplicates(int[] nums) {
      /*      int i = 0; int n= nums.length;
            while (i < n-1) {
                int target = nums[i];
                int j = i + 1;
                if (target == nums[j]) {
                    while (j < nums.length - 1) {
                        nums[j] = nums[j + 1];
                        j++;
                    }
                   n=n-1;
                }
                if (nums[i] != nums[i + 1]) {
                    i++;
                }

            }

           return i+1;

        }
*/
            int pointer1 = 0;
            for(int pointer2 = 1; pointer2 < nums.length; pointer2++) {
                if(nums[pointer2] != nums[pointer1]) {
                    pointer1++;
                   nums[pointer1] = nums[pointer2];
                }

            }
            return pointer1 + 1;
        }
}
