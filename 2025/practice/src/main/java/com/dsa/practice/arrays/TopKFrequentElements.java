package com.dsa.practice.arrays;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements within the array.
 *
 * The test cases are generated such that the answer is always unique.
 *
 * You may return the output in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,3,3], k = 2
 *
 * Output: [2,3]
 * Example 2:
 *
 * Input: nums = [7,7], k = 1
 *
 * Output: [7]
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topK = new TopKFrequentElements();
       // System.out.println(topK.findTopKUsingStreams(new Long[]{1L, 2L, 2L, 3L, 3L, 3L}, 2));
        System.out.println(topK.findTopKUsingBucketSort(new int[]{1,2,2,3,3,3}, 2));
    }
    private List<Integer> findTopKUsingStreams(Long[] input, int limit){

       return Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).map(entry->entry.getKey().intValue()).collect(Collectors.toList()).subList(0,limit);

    }

    private List<Integer> findTopKUsingHeap(int[] input, int limit){

        final Map<Integer, Integer> counts = new HashMap<>();
        final PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i:input){
            counts.put(i, counts.getOrDefault(i,0)+1);
        }

       counts.entrySet().forEach(entry->{
           queue.add(new int[] {entry.getValue(), entry.getKey()});
           if(queue.size() > limit) queue.poll();
       });

        return queue.stream().map(array->array[1]).collect(Collectors.toList());


    }


    private List<Integer> findTopKUsingBucketSort(int[] input, int limit){

        final Map<Integer, Integer> counts = new HashMap<>();
        final List<Integer> result = new ArrayList<>();

        for(int i:input){
            counts.put(i, counts.getOrDefault(i,0)+1);
        }

        final int[] buckets = new int[input.length];

        counts.forEach((key, value) -> buckets[value] = key);

        int var= buckets.length-1;

        while(limit > 0){
            if(buckets[var] >0) {
                result.add(buckets[var]);
                limit--;
            }
            var--;
        }

        return result;



    }

    private List<Integer> quickSelect(int[] input, int k){
        return null;

        /** TODO
         *
         */

    }

}
