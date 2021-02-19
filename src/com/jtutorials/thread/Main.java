package com.jtutorials.thread;

public class Main {
    public static void main(String args[])
    {
        // creating objects t1 of MyThread
        MyThread t1 = new MyThread();

        try {
            Thread.sleep(1);

            // t1 is an object of MyThread
            // which has an object t
            // which is of type Thread
            t1.t.interrupt();

            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread");
    }
}

