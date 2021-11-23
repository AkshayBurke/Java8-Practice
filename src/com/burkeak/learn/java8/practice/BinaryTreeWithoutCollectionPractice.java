package com.burkeak.learn.java8.practice;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class BinaryTreeWithoutCollectionPractice {
    Node root;
    BinaryTreeWithoutCollectionPractice(int data){
        root = new Node(10);
    }


    Node insertNewNode(int data,Node root){
        if(root==null){
            return new Node(data);
        }
        if(root.data<data){
            System.out.println(data+" inserting at right of : "+root.data);
            root.right=insertNewNode(data,root.right);
        }else if(root.data>data){
            System.out.println(data +" inserting at left of : "+root.data);
            root.left=insertNewNode(data,root.left);
        }else{
            return root;
        }
        return root;
    }

    void addNewElement(int data){
     insertNewNode(data,root);
    }

    void displayPreOrder(Node root){
        if(root!=null){
            System.out.println(""+root.data);
            displayPreOrder(root.left);
            displayPreOrder(root.right);
        }
    }

    void displayPostOrder(Node root){
        if(root!=null){
            displayPostOrder(root.left);
            displayPostOrder(root.right);
            System.out.println(""+root.data);
        }
    }

    void displayIntOrder(Node root){
        if(root!=null){
            displayIntOrder(root.left);
            System.out.println(""+root.data);
            displayIntOrder(root.right);

        }
    }

    public static void main(String[] args) {
        BinaryTreeWithoutCollectionPractice br= new BinaryTreeWithoutCollectionPractice(10);
        br.addNewElement(20);
        br.addNewElement(30);
        br.addNewElement(9);
        br.addNewElement(5);
        br.addNewElement(23);
        br.addNewElement(40);
        System.out.println("In Order Traversal :");
        br.displayIntOrder(br.root);
        System.out.println("Post Order Traversal :");
        br.displayPostOrder(br.root);
        System.out.println("Pre Order Traversal :");
        br.displayPreOrder(br.root);

    }
}
