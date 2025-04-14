package com.Graphs;



class PrefixTree {
    Node root;
    class Node{
        Node[] children;
        boolean isEndofWord;
        char val;

        Node(char val){
            this.val = val;
            this.children = new Node[26];
            this.isEndofWord = false;
        }

    }

    public PrefixTree() {
        root= new Node('\0');

    }

    public static void main(String[] args) {
        PrefixTree tree = new PrefixTree();
        tree.insert("apple");
    }

    public void insert(String word) {
        Node curr = root;
        for(char c: word.toCharArray()){
            Node toFind = curr.children[c-'a'];
            if(toFind ==null){
                toFind = new Node(c);
            }
            curr = toFind;
        }
        curr.isEndofWord = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for(char c: word.toCharArray()){
            Node toFind = curr.children[c-'a'];
            if(toFind ==null){
                return false;
            }
            curr = toFind;
        }
        return curr.isEndofWord ;


    }

    public boolean startsWith(String prefix) {

        Node curr = root;
        for(char c: prefix.toCharArray()){
            Node toFind = curr.children[c-'a'];
            if(toFind ==null){
                return false;
            }
            curr = toFind;
        }
        return true ;

    }
}
