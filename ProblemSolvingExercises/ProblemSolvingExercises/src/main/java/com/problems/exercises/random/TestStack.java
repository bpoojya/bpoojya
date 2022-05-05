package com.problems.exercises.random;

public class TestStack {
    public static void main(String args[]){
        Node<Integer> n1= new Node(1);
        Node<Integer> n2= new Node(2); Node<Integer> n3= new Node(3);
        Node<Integer> n4= new Node(4);
        Node<Integer> n5 = new Node(5);
        Stack<Integer> list= new Stack<>();
        list.push(n1);
        list.push(n2);
        list.push(n3);
        System.out.println(list.toString());

        list.push(n4);
        list.push(n5);
        System.out.println(list.toString());
        list.push(new Node<>(6));
        list.push(new Node<>(7));
        System.out.println(list.toString());
        list.pop();
        System.out.println(list.toString());
        list.pop();
        System.out.println(list.toString());
        System.out.println(list.peek());


    }
}
