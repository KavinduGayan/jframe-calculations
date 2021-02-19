package com.jtutorials.designpattern.factory;

public class MainClass {
    public static void main(String[] args) {
        SalaryFactory salaryFactory = new SalaryFactory();
        Salary programmer=salaryFactory.getSalaryClass("PROGRAMMER");
        System.out.println(programmer.getSalary());
        Salary account=salaryFactory.getSalaryClass("ACCOUNT");
        System.out.println(account.getSalary());

    }
}
