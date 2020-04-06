package com.rahuldhillo.basics.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);

        /*queue.element();
        System.out.println(queue);*/ // will generate no such exception.

        try {
            queue.add(30);
            queue.add(20);
            queue.add(10);
            queue.add(5);
        }catch (IllegalStateException e){
            System.out.println("Trying to add more items.");
        }
        for(Integer q: queue) {
            System.out.println(q);
        }

        System.out.println();

        System.out.println(queue.element());

        try {
            queue.remove();
            queue.remove();
            queue.remove();
            queue.remove();
        }catch (NoSuchElementException e){
            System.out.println("Trying to remove more items.");
        }

        for(Integer q: queue) {
            System.out.println(q);
        }

        //The above methods generate exceptions but the below methods will return null/false in those conditions.

        Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(2);
        System.out.println();
        queue2.offer(50);
        queue2.offer(60);

        System.out.println("Queue 2 peek: " + queue2.peek());

        if (queue2.offer(30) == false){
            System.out.println("This is false");
        };//will not generate exception even if Queue capacity is 2
        queue2.offer(20);

        for(Integer q: queue2) {
            System.out.println(q);
        }
        System.out.println();
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());


    }
}
