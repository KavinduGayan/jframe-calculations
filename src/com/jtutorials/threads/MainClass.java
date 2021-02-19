package com.jtutorials.threads;

import java.util.Date;

public class MainClass implements Runnable{

    @Override
    public void run() {
        System.out.println("running "+new Date());
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.run();
        Thread thread=new Thread(mainClass);
        thread.start();
    }
}
