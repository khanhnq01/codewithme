package org.example.Java.Threads;

public class Test extends Thread{
    public void run(){
        System.out.println("Thread is running");
        long start = 0l;
        for (long i = 0; i < 1000000000; i++) {
            start += i;
        }
        System.out.println("Thread is running end");
    }

    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            new Test().start();

        }
        System.out.println("Finish Thread");
    }
}
