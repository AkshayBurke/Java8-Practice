package com.burkeak.learn.datastructure;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(12);
        myQueue.offer(22);
        myQueue.offer(32);
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println();
        System.out.println(myQueue);
    }
}
