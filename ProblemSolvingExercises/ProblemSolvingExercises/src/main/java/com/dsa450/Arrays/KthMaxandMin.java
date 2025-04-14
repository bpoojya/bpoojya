package com.dsa450.Arrays;

import com.dsa450.Arrays.helpers.HeapSort;

import java.util.PriorityQueue;

/**
 * Given an array arr[] and an integer K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(log(n))
 * Constraints:
 * 1 <= N <= 105
 * 1 <= arr[i] <= 105
 * 1 <= K <= N
 *
 */
public class KthMaxandMin {
    public static void main(String args[]){
        System.out.println(kthMax(new int[]{7,10,3,4,20,15},4));
        System.out.println(kthmin(new int[]{7,10,3,4,20,15},4));
    }

    static int kthMax(int [] array,int k ){
        int n= array.length;
        for (int i = n/2-1; i >=0; i--){
            HeapSort.heapify(array, i,n);}


        for(int i=n-1;i>=n-k;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            HeapSort.heapify(array, 0, i);
        }
        return array[n-k];
    }

    static int kthmin(int [] array,int k ){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
// Approach 2..add the array items in priority queue which will internally do heapification and get the kth element logn time operation
        for(int i:array){
            pq.add(i);
        }
        //return 3 minimum
       for(int i=0;i<k-1;i++) pq.poll();
       return pq.poll();
    }
}
