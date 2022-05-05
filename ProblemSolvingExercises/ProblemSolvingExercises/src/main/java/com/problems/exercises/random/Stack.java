package com.problems.exercises.random;



public class Stack<T>{
    LinkedList<T> list;
    Stack(){
        list= new LinkedList<T>();
    }
    public void push(Node<T> node){
        list.insertAtEnd(node);
    }
    public Node<T> pop(){
      Node<T> n= list.getLast();
      list.removeAtEnd();
      return n;
    }
    public Node<T> peek(){
      return list.getLast();
    }
    @Override
    public String toString(){
       return this.list.toString();
    }
}
