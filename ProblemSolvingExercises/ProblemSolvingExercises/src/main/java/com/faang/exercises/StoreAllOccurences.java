package com.faang.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreAllOccurences {
    public static void main(String args[]) {
       //storeOccurences(new int[]{5,5,8,7,8,6,3,5}, 0,8,5,new ArrayList<Integer>()).stream().forEach(s->System.out.println(s));
        Arrays.stream(storeOccurences2(new int[]{5,5,8,7,8,6,3,5}, 0,8,5,new int[8],0)).forEach((s -> System.out.println(s)));
    }
 /*static List<Integer> storeOccurences(int input[], int start, int n, int target, List<Integer> output){

        if(n==0){
            return output ;
                }

        if(input[start]==target){
       output.add(start);
        }
    return storeOccurences(input,start+1,n-1,target,output);
 }
*/
// store in array
    static int[] storeOccurences2(int[] input,int start,int n, int target, int[] output, int index){
        if(n==0){
            return output ;
        }

        if(input[start]==target){
          output[index]=start;
          index++;
        }
        return storeOccurences2(input,start+1,n-1,target,output,index);
    }

}
