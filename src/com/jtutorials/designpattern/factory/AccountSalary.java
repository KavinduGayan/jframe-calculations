package com.jtutorials.designpattern.factory;

public class AccountSalary extends Salary{
    private double commisionRate=0.2;
    private double basicSalary=12;
    @Override
    double getSalary() {
        return basicSalary+(basicSalary*commisionRate);
    }
}
