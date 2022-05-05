package com.problems.exercises.trees;

import com.problems.exercises.random.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree<T> {
    Stack<NodeBST> stack= new Stack<>();
    NodeBST<T> left;
    NodeBST<T> right;
    NodeBST<T> root;
    int size = 0;

    BinarySearchTree() {
        root = null;
        left = null;
        right = null;
    }

    public NodeBST<T> insert(NodeBST<T> node){
        root= insertRec(root,node);
        return root;
    }
    public NodeBST<T> insertRec(NodeBST<T> root,NodeBST<T> node) {
        if (root == null) {
            root = node;
            return root;
        } else {
            if ((Integer) node.data < (Integer) root.data) {
               root.left=insertRec(root.left,node);

            }
            if ((Integer) node.data > (Integer) root.data) {
                root.right = insertRec(root.right,node);

            }
        }

        size++;
        return root;
    }


    public void removeNode(NodeBST<T> node) {

    }

    public NodeBST<T> isNodeFound(NodeBST<T> root,NodeBST node) {

        if (root == null) {
            return null;
        } else {
            if (root.data.equals(node.data)) {
                return root;
            }
            if ((Integer) node.data < (Integer) root.data) {
               root.left =isNodeFound(root.left,node);
            }
            if ((Integer) node.data > (Integer) root.data) {
                root.right=isNodeFound(root.right,node);
            }
        }
      return root;

    }
    void inorder(){
        inorderRec(root);
    }
    void preOrder(){
        preOrderTraversal(root);
    }
    void postOrder(){
        postOrderTraversal(root);
    }
    void inorderRec(NodeBST root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
    void preOrderTraversal(NodeBST root){
        if(root!=null) {
            System.out.println(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    void postOrderTraversal(NodeBST root){
        if(root!=null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root);
        }
    }
    int height(NodeBST root){
        if(root==null){
            return 0;
        }
        int lHeight=height(root.left);
        int rHeight= height(root.right);
        if(lHeight<rHeight){
            return lHeight+1;
        }
        else{
            return rHeight+1;
        }
    }
    void lineOrderTraversal(){
        if(root!=null){

            int h = height(root);
            int i;
            for (i = 1; i <= h; i++)
                printCurrentLevel(root, i);
        }
        }
    void printCurrentLevel(NodeBST root, int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.println(root);
        }
        else{
           printCurrentLevel(root.left,level-1);
           printCurrentLevel(root.right,level-1);
        }

    }
    void LevelOrderqueueTraversal(){
        Deque<NodeBST> dequeue= new LinkedList<>();
        dequeue.addLast(root);
        NodeBST<T> curr= root;
        while(curr!=null && dequeue.size()!=0){
            curr=dequeue.removeFirst();
          if(curr.left!=null)  dequeue.addLast(curr.left);
           if(curr.right!=null) dequeue.addLast(curr.right);

            System.out.println(curr);

        }
    }
  void increasing(){
     increasingBST(root);
  }

    public NodeBST increasingBST(NodeBST root) {
        pushStack(root);
        NodeBST finalNode=stack.pop();NodeBST head=finalNode;
        while(stack.size()!=0){
            finalNode.right=stack.pop();
            finalNode=finalNode.right;
        }
        return head;
    }
    void pushStack(NodeBST root){

        if(root==null){
            return ;
        }
        pushStack(root.right);
        stack.push(root);
        pushStack(root.left);


    }
}