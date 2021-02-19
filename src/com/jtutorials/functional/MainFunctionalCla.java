package com.jtutorials.functional;

public class MainFunctionalCla {
    public static void main(String[] args) {
        String val="hi";
        Shape shape1= km -> km * 1000;
        System.out.println(shape1.calculateMeter(12));

        Thread t1 = new Thread(() -> {
            String a = "this is query"+val;
            System.out.println(a);
        });
        t1.start();
    }
}
