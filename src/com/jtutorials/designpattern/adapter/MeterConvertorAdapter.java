package com.jtutorials.designpattern.adapter;

public class MeterConvertorAdapter implements MileConverter {
    private KmConverter kmConverter;

    public MeterConvertorAdapter() {
    }

    public MeterConvertorAdapter(String converType) {
        if ("KM".equalsIgnoreCase(converType)) {
            this.kmConverter = new KmConverterImpl();
        }
    }

    public double convert(double meter,String converType) {
        if ("KM".equalsIgnoreCase(converType)) {
            kmConverter.hoot();
            return kmConverter.convertToKm(meter);
        }
        else {
            return meter*0.00062137119224;
        }
    }
}
