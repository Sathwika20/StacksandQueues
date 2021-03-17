package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class StackTest {
    static  Stack stack = new Stack();

    @Test
    public void given_three_numbers_when_added_should_have_last_added_node() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        Stack myStack = new Stack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);
    }

    @Test
    public void given_three_numbers_should_pop_till_it_is_empty() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        Stack myStack = new Stack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode pop = myStack.pop();
        myStack.printStack();
        INode popLast = myStack.popLast();
        myStack.printStack();
        Assert.assertEquals(myThirdNode,pop);
        Assert.assertEquals(null,popLast);
    }

}