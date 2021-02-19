package com.jtutorials.methodreference;

public class MainClass {
    public static void main(String[] args) {
        print();
        Thread t = new Thread(MainClass::print);
        t.start();
        String a=String.valueOf(getInt());
        System.out.println(a);
    }

    public static void print() {
        System.out.println("Hello ");
    }
    public static int getInt() {
        return 0;
    }
}
