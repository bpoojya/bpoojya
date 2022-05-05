package com.problems.exercises.recursion;

import com.problems.exercises.random.LinkedList;
import com.problems.exercises.random.Node;

public class ReverseLinkedList {
    public static void main(String args[]) {
        Node<Integer> n1 = new Node(1);
        Node<Integer> n2 = new Node(2);
        Node<Integer> n3 = new Node(3);
        Node<Integer> n4 = new Node(4);
        Node<Integer> n5 = new Node(5);
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtHead(n1);
        list.insertAtHead(n2);
        list.insertAtHead(n3);
        list.insertAtHead(n4);
        list.insertAtHead(n5);
        System.out.println(list.toString());
    //    reverseList(list,list.getFirst());
        System.out.println(list.toString());
    }
}
