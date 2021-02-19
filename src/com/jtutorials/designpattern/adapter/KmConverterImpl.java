package com.jtutorials.designpattern.adapter;

public class KmConverterImpl implements KmConverter {
    @Override
    public double convertToKm(double meter) {
        return meter/1000;
    }
}
