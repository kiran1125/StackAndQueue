package org.bridgelabz;

public class MyQueue {
    Node head,tail;

    public void enQueue(int data) {
        Node nNode = new Node(data);
        if (head == null){
            head = tail = nNode;
            head.next = null;
        }
        else{
            tail.next = nNode;
            tail = nNode;
        }
    }

    /**
     * Create a new node which has data and next pointer
     */
    class Node{
        int data;                                //class level variables
        Node next;

        /**
         * parameterised constructor to create a node
         * @param data
         */
        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
