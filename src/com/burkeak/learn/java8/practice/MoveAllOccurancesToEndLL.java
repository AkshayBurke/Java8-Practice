package com.burkeak.learn.java8.practice;

public class MoveAllOccurancesToEndLL {
    static class Node{
        int data;
        Node next;
    }

    static Node getNewNode(int x){
        Node temp = new Node();
        temp.data=x;
        temp.next=null;

        return temp;
    }

    static void printList(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void moveToEnd(Node head, int key){

        Node pKey=head;
        Node temp=head;

        while(temp.next!=null){
            if(temp!=pKey && temp.data !=key){
                pKey.data=temp.data;
                temp.data=key;
                pKey=pKey.next;
            }

            if(pKey.data!=key){
                pKey=pKey.next;
            }
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head=getNewNode(10);
        head.next=getNewNode(20);
        head.next.next=getNewNode(10);
        head.next.next.next=getNewNode(30);
        head.next.next.next.next=getNewNode(10);
        head.next.next.next.next.next=getNewNode(300);

        printList(head);
        moveToEnd(head,10);
        printList(head);
    }
}