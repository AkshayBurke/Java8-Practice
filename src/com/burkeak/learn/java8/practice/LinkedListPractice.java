package com.burkeak.learn.java8.practice;

public class LinkedListPractice {

    static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
        this.data=data;
        this.next=null;
        }
    }

    static Node getNewNode(int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        return temp;
    }

    /*static Node createHeadNode(int data){
        return getNewNode(data);
    }*/

    static void addNewNode(int data, Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=getNewNode(data);
    }

    static Node deleteAtStart(Node head){
        Node temp=head;
        if(null!=temp){
            if(temp.next==null){
               return null;
            }else{
                head=temp.next;
            }
        }
        return head;
    }

    static void displayList(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Node head =new Node(5);
        addNewNode(4,head);
        addNewNode(6,head);
        addNewNode(7,head);
        addNewNode(8,head);
        System.out.println("Display List :");
        displayList(head);
        addNewNode(17,head);
        addNewNode(37,head);
        addNewNode(57,head);
        System.out.println("Display List :");
        displayList(head);
        head=deleteAtStart(head);
        head=deleteAtStart(head);
        head=deleteAtStart(head);
        System.out.println("Display List after delete:");
        displayList(head);

    }
}
