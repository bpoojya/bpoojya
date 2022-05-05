package com.problems.exercises.random;

public class LinkedList<T> {

    public int size = 0;
    Node<T> head;
    Node<T> tail;

   public LinkedList() {
        this.head = null;
        this.tail = null;

    }


    public void insertAtEnd(Node<T> node) {
        if (head != null) {
            tail.next = node;
            tail = node;
        } else {
            head = node;
            tail = head;
        }
        size++;
    }

    public void removeAtEnd() {
        if (size != 0) {
            Node n = getAtIndex(size - 2);

            n.next = null;
            tail = n;
            size--;
        }
    }

    public void insertAtIndex(Node<T> node, int index) {
        if (index != size - 1) {
            Node n = getAtIndex(index);
            node.next = n.next;
            n.next = node;
            size++;
        } else {
            this.insertAtEnd(node);
        }

    }

    public void removeAtIndex(int index) {
        if (index > 0) {
          //  Node n1 = getAtIndex(index + 1);
            Node n2 = getAtIndex(index-1);
            Node n3=getAtIndex(index);
            n2.next = n3.next;
            n3.next = null;
            size--;
        } else {
            removeAtHead();
        }
    }
    public void insertAtHead(Node<T> node) {
        if (head != null) {
            node.next = head;
            head = node;
        } else {
            head = node;
            tail = head;
        }
        size++;
    }


    public void removeAtHead() {
        if (head != null) {
            Node n = head;
            head = head.next;
            n.next = null;
            size--;
        }

    }

    public Node<T> getFirst() {
        return head;
    }

    public Node<T> getLast() {
        return tail;

    }

    public Node<T> getAtIndex(int i) {

        int count = 0;
        Node n = head;
        Node result = null;
        if (size != 0) {
            for (int p = 0; p < size; p++) {
                if (count == i) {
                    return n;
                } else {
                    result = n.next;

                    count++;
                    n = result;

                }
            }

        }
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = getAtIndex(i)!=null?s+getAtIndex(i).toString():s+"";
        }
        return s;
    }
}
