package com.company;

import java.util.EmptyStackException;

public class LinkedList {


    class Node {
        Object data;
        Node next;

        public Node(Object data){
            this.data = data;
        }

    }

    private Node head;

    public void push(Object data) {

        Node myNode = new Node(data);
        myNode.next = head;
        head = myNode;

    }

    private boolean isEmpty() {

        return head == null;
    }

    public Object peek() {

        if (isEmpty()) {
            return null;
        } else {
            return head.data;
        }

    }

    public Object pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Object myObject = head.data;
            head = head.next;
            return myObject;
        }

    }

    //TDD Red
//    public boolean contains(Object data) {
////        return false;
////    }

    //TDD Green
//    public boolean contains(Object data) {
////        return true;
////    }


    //TDD Refactor
    public boolean contains(Object value) {

        Node currentNode = head;

        while (currentNode.data != value && currentNode.next !=null) {
            currentNode = currentNode.next;
            if (currentNode.data == value) {
                return true;
            }

        }

        return false;

    }


    public int size() {

        int count = 1;
        Node current = head;

        if (head == null) {
            return 0;
        }

        while(current.next != null) {
            count++;
            current = current.next;
        }

        return count;

    }

    public Object peekN(int nth) {

        Node current = head;
        int index = 0;

        while (index != nth) {
            current = current.next;
            index ++;
        }

        if (current.data == null){
            return null;
        }

        return current.data;
    }


}
