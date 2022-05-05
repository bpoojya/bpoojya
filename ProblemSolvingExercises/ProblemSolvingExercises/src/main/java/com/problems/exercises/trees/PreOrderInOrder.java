package com.problems.exercises.trees;

import java.util.HashMap;
import java.util.Map;

public class PreOrderInOrder {
    static Map<Character,Integer> map= new HashMap<>();
    static int preIndex=0;
    public static  void main(String args[]){
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length-1;

        mapIndex(in);
        NodeBST root=buildTree(in,pre,0,len);
        printTree(root);
    }
    static NodeBST buildTree(char[] in, char[] pre,int start, int n){
        if(start>n){
            return null;
        }

        NodeBST  node=new NodeBST(pre[preIndex++]);
        if(start==n){
           return node;
        }
        int index= map.get(node.data);
        node.left=buildTree(in,pre,start,index-1);
        node.right=buildTree(in,pre,index+1,n);
        return node;
    }

    static void   mapIndex(char[] input){
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
