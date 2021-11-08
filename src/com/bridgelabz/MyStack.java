package com.bridgelabz;

/**
 * Creating a stack with LinkedList
 * @author - kiran
 * @Dated - 8/11/2021
 */
public class MyStack {
    Node head,top;                                //Class level variables

    /**
     * To push the data to stack with input data
     * @param data
     */
    public void push(int data) {
        Node nnode = new Node(data);
        if (head == null){
            head = top = nnode;
        }
        else{
            Node temp = top;                        //Swapping
            top = nnode;
            temp.next = top;
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
