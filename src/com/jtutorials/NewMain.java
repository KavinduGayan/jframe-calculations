package com.jtutorials;

// Main class
public class NewMain {
    public static void main(String args[])
    {
        // creating two objects t1 & t2 of MyThread
        MyThread t1 = new MyThread("First  thread");
        MyThread t2 = new MyThread("Second thread");
        try {
            Thread.sleep(500);
            t1.stop(); // stopping thread t1
            t2.stop(); // stopping thread t2
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread");
    }
}
