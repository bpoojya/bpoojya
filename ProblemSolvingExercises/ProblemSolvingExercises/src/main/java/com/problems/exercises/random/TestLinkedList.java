package com.problems.exercises.random;

public class TestLinkedList {
    public static void main(String args[]){
        Node<Integer> n1= new Node(1);
        Node<Integer> n2= new Node(2); Node<Integer> n3= new Node(3);
        Node<Integer> n4= new Node(4);
        Node<Integer> n5 = new Node(5);
        LinkedList<Integer> list= new LinkedList<>();
        list.insertAtHead(n1);
        list.insertAtHead(n2);
        list.insertAtHead(n3);
        System.out.println(list.toString());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.insertAtIndex(n4,2);
        list.insertAtIndex(n5,1);
        System.out.println(list.toString());
        list.insertAtEnd(new Node<>(6));
        list.insertAtEnd(new Node<>(7));
        System.out.println(list.toString());
        list.removeAtEnd();
        System.out.println(list.toString());
        list.removeAtHead();
        System.out.println(list.toString());
        list.removeAtIndex(1);
        System.out.println(list.toString());


    }
}
