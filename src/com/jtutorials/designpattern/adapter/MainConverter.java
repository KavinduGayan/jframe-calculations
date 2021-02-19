package com.jtutorials.designpattern.adapter;

import static java.lang.System.*;

public class MainConverter {
    public static void main(String[] args) {
        MeterConvertorAdapter meterConvertorAdapter = new MeterConvertorAdapter();
        out.println(meterConvertorAdapter.convert(5000,"MILE"));


        MeterConvertorAdapter meterConvertorAdapter1 = new MeterConvertorAdapter("KM");
        out.println(meterConvertorAdapter1.convert(5000,"KM"));
    }
}
