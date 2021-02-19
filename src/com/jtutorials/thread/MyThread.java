package com.jtutorials.thread;

class MyThread implements Runnable {

    Thread t;

    MyThread()
    {
        t = new Thread(this);
        System.out.println("New thread: " + t);
        t.start(); // Starting the thread
    }

    // execution of thread starts from run() method
    public void run()
    {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread has stopped.");
    }
}