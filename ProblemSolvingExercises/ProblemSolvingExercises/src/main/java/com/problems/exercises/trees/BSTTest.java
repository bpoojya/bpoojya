package com.problems.exercises.trees;

public class BSTTest {
    public static void main(String args[]){
        BinarySearchTree<Integer> tree= new BinarySearchTree<>();
        tree.insert(new NodeBST<>(50));
        tree.insert(new NodeBST<>(30));
        tree.insert(new NodeBST<>(20));
        tree.insert(new NodeBST<>(40));
        tree.insert(new NodeBST<>(70));
        tree.insert(new NodeBST<>(60 ));
        tree.insert(new NodeBST<>(80 ));

        // print inorder traversal of the BST
       // tree.inorder();
        //tree.preOrder();
        //tree.postOrder();
       // tree.lineOrderTraversal();
       // tree.LevelOrderqueueTraversal();
        tree.increasing();

    }


}
