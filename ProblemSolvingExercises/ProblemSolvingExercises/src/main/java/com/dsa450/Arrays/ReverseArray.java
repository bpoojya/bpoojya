package com.dsa450.Arrays;
/*G iven an array (or string), the task is to reverse the array/string.
        Examples :


        Input  : arr[] = {1, 2, 3}
        Output : arr[] = {3, 2, 1}

        Input :  arr[] = {4, 5, 1, 2}
        Output : arr[] = {2, 1, 5, 4}

Time:O(n/2)==O(n)
Space O(1)
 */


import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]){
        Arrays.stream(reverseArray(new int[]{1,2,3})).forEach(s-> System.out.print(s+ " "));
        System.out.println("\n");
        Arrays.stream(reverseArray(new int[]{4, 5, 1, 2})).forEach(s-> System.out.print(s+ " "));

    }

    static int[] reverseArray(int[] array){
        int i=0; int j=array.length-1;
        while(i<=j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
}
