package com.bridgelabz;

/**
 * Creating a stack with LinkedList
 * @author - kiran
 * @Dated - 8/11/2021
 */
public class MyStack {
    Node head;                                //Class level variables

    /**
     * To push the data to stack with input data
     * @param data
     */
    public void push(int data) {
        Node nnode = new Node(data);
        if (head == null){
            head = nnode;
        }
        else{
            Node temp = head;                        //Swapping
            head = nnode;
            head.data = nnode.data;
            head.next = temp;
        }
    }

    /**
     * It returns the head data
     * @return value
     */
    public int peek() {
        int value = head.data;
        return value;
    }

    /**
     * this function deletes the top value
     */
    public void pop(){
        if(head == null) {
            System.out.println("Stack is empty");
        }
        else {
            Node temp = head;
            head = head.next;
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
