package com.dsa450.Arrays;


import java.util.*;

/**
 * Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
 *
 * Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
 Expected Time Complexity : O((n+m)log(n+m))
 Expected Auxilliary Space : O(n+m)
 */
public class UnionIntersection {
    public static void main(String args[]){
       unionArrays(new int[]{5 ,3}, new int[]{1, 2, 3, 4 ,5}).forEach(s->System.out.println(s));
        intersectionArrays(new int[]{5 ,3}, new int[]{1, 2, 3, 4 ,5}).forEach(s->System.out.println(s));
    }

    static Set<Integer> unionArrays(int[] arry1, int [] arry2){
        Set<Integer> finalset= new HashSet<>();
        for(int i:arry1){
            finalset.add(i);
        }
        for(int i:arry2){
            finalset.add(i);
        }
        return finalset;
    }

    static List<Integer> intersectionArrays(int[]array1, int array2[]){
        List<Integer> list= new ArrayList<>();
        int n1=array1.length;
        int n2=array2.length;
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(n1<n2){
            for(int i:array1){
                if(binarySearch(array2,i)) list.add(i);
            }
        }
        else{
            for(int i:array2){
                if(binarySearch(array1,i)) list.add(i);
            }
        }

        return list;
    }

    static boolean binarySearch(int[] array, int i){
       return search(0,array.length-1,array,i);
    }
    static boolean search(int low, int high, int [] array, int val){
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==val) return true;
            else if(val<array[mid]){
              return  search(low,mid-1,array,val);
            }
            else return search(mid+1,high,array,val);
        }
        return false;
    }
}
