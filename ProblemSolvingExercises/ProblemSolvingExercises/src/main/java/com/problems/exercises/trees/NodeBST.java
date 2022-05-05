package com.problems.exercises.trees;

public class NodeBST<T> {
    T data;
    NodeBST left;
    NodeBST right;


    NodeBST(T data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

    @Override
    public String toString() {
        return this.data.toString() ;
    }

}