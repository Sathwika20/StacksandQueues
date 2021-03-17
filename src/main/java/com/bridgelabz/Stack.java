package com.bridgelabz;

public class Stack<K>{
    private final Linkedlist linkedList;
    public Stack() {
        this.linkedList = new Linkedlist();
    }

    public void push(INode myNode) {
        linkedList.add(myNode);
    }
    public void printStack() {
        linkedList.printMyNodes();
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode pop() {
        return linkedList.pop();
    }

    public INode popLast() {
        return linkedList.popLast();
    }
}
