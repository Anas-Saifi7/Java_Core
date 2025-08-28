package com.info;

public class ProducerConsumer implements Runnable {
    int apples = 0; 

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread producer = new Thread(pc, "Tree");
        Thread consumer1 = new Thread(pc, "Worm");
        Thread consumer2 = new Thread(pc, "Bird"); 

        producer.start();
        consumer1.start();
        consumer2.start(); 
    }

    synchronized void produce() {
        while (true) {
            if (apples > 100) {
                try {
                    System.out.println("Waiting for apples to be eaten");
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); 
                }
            }
            try {
                int i = (int) (Math.random() * 100) + 1;
                Thread.sleep(i * 10);
                apples += i;
                System.out.println("Produced apples = " + apples);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
            notifyAll();
        }
    }

    synchronized void consume() {
        while (true) {
            int i = (int) (Math.random() * 100) + 1;
            if (apples < i) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting for " + (i - apples) + " more apples");
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); 
                }
            }
            try {
                if (apples >= i) {
                    System.out.println(Thread.currentThread().getName() + " busy eating " + i + " apples");
                    Thread.sleep(i * 10); 
                    apples -= i;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            notifyAll();
        }
    }

    public void run() {
        if (Thread.currentThread().getName().equals("Tree")) {
            produce();
        } else {
            consume();
        }
    }
}