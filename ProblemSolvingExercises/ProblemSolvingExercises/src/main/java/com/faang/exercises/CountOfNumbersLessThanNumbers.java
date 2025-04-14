package com.faang.exercises;

import java.util.*;

public class CountOfNumbersLessThanNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String args[]) {
        kClosest(new int[][]{{1,3},{-2,2}},1);

    }
    public static int[][] kClosest(int[][] points, int k) {
        final int[][] result = new int[k][2];

        final PriorityQueue<int[]> heap = new PriorityQueue<>((arr1,arr2)-> (arr2[0]*arr2[0]+arr2[1]*arr2[1]) -(arr1[0]*arr1[0]+arr1[1]*arr1[1]));

        for(int[] point :points){
            heap.add(point);
            if(heap.size()>k) heap.poll();
        }
        while(k>0){
            result[--k] = heap.poll();

        }

        return result;
    }

}