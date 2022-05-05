package com.problems.exercises.trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InOrderLevelOrder {
    static Map<Integer,Integer> map= new HashMap<>();
    public static  void main(String args[]){
        int in[] = new int[] { 4, 8, 10, 12, 14, 20, 22 };
        int level[]
                = new int[] { 20, 8, 22, 4, 12, 10, 14 };
        int len = in.length-1;

        mapIndex(in);
        NodeBST root=buildTree(in,level,0,len);
        printTree(root);
    }
    static NodeBST buildTree(int[] in, int[] level,int start, int n){
        HashSet<Integer> set= new HashSet<>();
        if(start>n){
            return null;
        }

        NodeBST  node=new NodeBST(level[0]);
       if(node==null){
           return null ;
       }
        int index= map.get(node.data);
       for(int i=0;i<index;i++){
           set.add(in[i]);
       }
       int leftLevel[]= new int[index-start]; int li=0;
       int rightLevel[]= new int[n-index]; int ri=0;
        for (int i = 1; i <=n; i++) {
            if (set.contains(level[i]))
                leftLevel[li++] = level[i];
            else
                rightLevel[ri++] = level[i];
        }
        node.left=buildTree(in,leftLevel,start,index-1);
        node.right=buildTree(in,rightLevel,index+1,n);
        return node;
    }

    static void   mapIndex(int[] input){
        for(int i=0;i<input.length;i++){
            map.put(input[i],i);
        }
    }

    static void printTree(NodeBST root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
}
