package com.bhavesh.company;

public class PartTimeEmp extends Employee{

    private int hourWorked;
    private  double hourlyRate;

    public PartTimeEmp(){

    }
    public PartTimeEmp(String name, int id,int hourWorked,double hourlyRate)
    {
        super(name, id);
        this.hourWorked=hourWorked;
        this.hourlyRate =hourlyRate;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourWorked*hourlyRate;
    }
}
