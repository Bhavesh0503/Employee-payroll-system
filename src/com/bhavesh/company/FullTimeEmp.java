package com.bhavesh.company;

public class FullTimeEmp extends Employee{

    private double monthlySalary;

    public FullTimeEmp(){
        monthlySalary = 0.0;
    }
    public FullTimeEmp(String name, int id,double monthlySalary)
    {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }


    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
