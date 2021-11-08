package org.bridgelabz;

public class MyQueue {
    Node head,tail;

    /**
     * EnQueue method is to add the data to the queue
     * @param data
     */
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
     * Dequeue method is to remove the link between the head and another element and making next element as head
     * @return data
     */

    public int deQueue() {
        if (head == null){
            System.out.println("Queue is empty");
            return 0;
        }
        int data = head.data;
        head = head.next;
        return data;

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
