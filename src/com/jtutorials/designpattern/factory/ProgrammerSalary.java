package com.jtutorials.designpattern.factory;

public class ProgrammerSalary extends Salary{
    private double commisionRate=0.1;
    private double basicSalary=10;

    @Override
    public double getSalary() {
        return basicSalary+(basicSalary*commisionRate);
    }
}
