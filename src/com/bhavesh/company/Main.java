package com.bhavesh.company;

public class Main {

    public static void main(String[] args) {

        PayRollSystem payrollsystem = new PayRollSystem();
        Employee e1 = new FullTimeEmp("Bhavesh",101,50000);
        Employee e2 = new PartTimeEmp("Vyankatesh",102,40,100);

//        payrollsystem.addEmployee(e1);
//        payrollsystem.addEmployee(e2);
        System.out.println("Initial Employee details : ");
        payrollsystem.displayEmployees();

        System.out.println("Removing Employee : ");
        payrollsystem.removeEmployee(102);

        System.out.println("Remaining Emoloyees : ");
        payrollsystem.displayEmployees();
    }
}
