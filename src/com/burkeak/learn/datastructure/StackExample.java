package com.burkeak.learn.datastructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(23);
        myStack.push(13);
        myStack.push(53);
        myStack.push(33);
        System.out.println(myStack.peek());
        System.out.println(myStack);
        myStack.pop();
        System.out.println();
        System.out.println(myStack);
    }
}
