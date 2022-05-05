package com.faang.exercises;

public class TowerOfHanoi {
   static int ans=0;
    public static void main(String args[]) {
        towersOfHanoi(3,"A","C","B");
        System.out.println(ans);
    }
    static void towersOfHanoi( int n,String source, String destination,String helper){
        if(n==0){

          return;
        }

        towersOfHanoi(n-1,source, helper,destination);
        System.out.println("Moving disk" + n+ "from "+source+" to"+ destination);
        ans++;
       // towersOfHanoi(1,"A","C","B");
        towersOfHanoi(n-1,helper,destination,source);



    }
}
