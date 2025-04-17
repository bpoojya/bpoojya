package com.dsa.practice.slidingWindow;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * There is only one row of fruit trees on the farm, oriented left to right. An integer array called fruits represents the trees, where fruits[i] denotes the kind of fruit produced by the ith tree.
 *
 *
 *
 * The goal is to gather as much fruit as possible, adhering to the owner's stringent rules:
 *
 *
 *
 * 1) There are two baskets available, and each basket can only contain one kind of fruit. The quantity of fruit each basket can contain is unlimited.
 *
 * 2) Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the starting tree. One of the baskets must hold the harvested fruits.
 *
 * 3) Once reaching a tree with fruit that cannot fit into any basket, stop.
 *
 *
 *
 * Return the maximum number of fruits that can be picked.
 *
 * Input : fruits = [1, 2, 1]
 *
 * Output : 3
 *
 * Input : fruits = [1, 2, 3, 2, 2]
 *
 * Output : 4
 */
public class FruitsIntoBasket {
    public static void main(String[] args) {
        FruitsIntoBasket fruitsIntoBasket = new FruitsIntoBasket();
        System.out.println(fruitsIntoBasket.findMaxFruitsSlidingWindow(new int[]{1, 2, 3,2,2}));
    }

    //o(3n) space and o(nlogn) time
    private int findMaxFruits(int[] nums){
        final Map<Integer, Integer> map = new HashMap<>();

        for(int i :nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

      final PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->b[0]-a[0]);
        map.forEach((k,v)->queue.add(new int[]{v,k}));


      return queue.poll()[0]+queue.poll()[0];

    }

    private int findMaxFruitsSlidingWindow(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int maxFruits = 0;

        int right = 0;
        int left = 0;
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (map.size()>2) {
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            if(map.size() <=2) maxFruits = Math.max(maxFruits, right - left + 1);
            right++;
        }

        return maxFruits;
    }
}
