package com.bridgelabz;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        System.out.println(myStack.peek() +"Removing from stack");
        myStack.pop();
        System.out.println(myStack.peek() +"Removing from stack");
        myStack.pop();
        System.out.println(myStack.peek() +"Removing from stack");
        myStack.pop();
        myStack.pop();
    }
}
