package com.problems.exercises.random;

public class Node <T>{
     T data;
     Node next;


    public  Node(T data){
       this.data= data;
       this.next=null;

    }
    @Override
    public String toString(){
         return this.data + " -->" ;
    }


}
