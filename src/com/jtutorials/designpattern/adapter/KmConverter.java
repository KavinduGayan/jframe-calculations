package com.jtutorials.designpattern.adapter;

@FunctionalInterface
public interface KmConverter {

    double convertToKm(double meter);

    default void hoot() {
        System.out.println("peep!");
    }
}
