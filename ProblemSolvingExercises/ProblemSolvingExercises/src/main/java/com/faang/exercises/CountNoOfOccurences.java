package com.faang.exercises;

public class CountNoOfOccurences {
    public static void main(String args[]) {
       System.out.println(countAllOccurences2(new int[]{5,5,8,7,8,6,3,5}, 0,8,5,0));
    }
 static int countAllOccurences(int input[],int start, int n, int target,int ans){

        if(n==0){
            return ans ;
                }

        if(input[start]==target){

        ans++;
        }
    return countAllOccurences(input,start+1,n-1,target,ans);
 }

    static int countAllOccurences2(int input[],int start, int n, int target,int ans){

        if(n==0){
            return ans ;
        }

        if(input[start]==target){

           return 1+countAllOccurences(input,start+1,n-1,target,ans);
        }
       else{
           return countAllOccurences(input,start+1,n-1,target,ans);
        }
    }
}
