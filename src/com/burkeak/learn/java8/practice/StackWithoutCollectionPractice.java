package com.burkeak.learn.java8.practice;

class Stack{
    final static int MAX=100;
    int[] a = new int[MAX];
    int top;

    Stack(){
        top=-1;
    }

    boolean isEmpty(){
        return top<0;
    }

    boolean isFull(){
        return top>=MAX-1;
    }

    void push(int data){
        if(isFull()) {
            System.out.println("Stack Overflow");
           // return false;
        }else{
            a[++top]=data;
            System.out.println(data + " Pushed into stack..!");
            //return true;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            //return -1;
        }else{
            int temp=a[top];
            top--;
            System.out.println(temp+" popped from stack...!");
            //return temp;
        }
    }

    int peak(){
        if(!isEmpty())
            return a[top];
        else
            return -1;
    }

    void display(){
        for(int i=top;i>-1;i--){
            System.out.println(a[i]);
        }
    }
}

public class StackWithoutCollectionPractice {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("element at peek : "+s.peak());
        s.pop();
        System.out.println("element at peek : "+s.peak());
        s.display();
    }
}
