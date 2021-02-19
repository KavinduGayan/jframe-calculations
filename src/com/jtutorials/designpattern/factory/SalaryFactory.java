package com.jtutorials.designpattern.factory;

public class SalaryFactory {

    public Salary getSalaryClass(String input) {
        if (input==null) {
            return null;
        }
        if ("ACCOUNT".equalsIgnoreCase(input)) {
            return new AccountSalary();
        }
        else if ("PROGRAMMER".equalsIgnoreCase(input)) {
            return new ProgrammerSalary();
        }
        return null;
    }
}
