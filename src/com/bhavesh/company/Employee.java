package com.bhavesh.company;

public abstract class Employee {

    private String name;

    private int id;

    public Employee() {
        name = "null";
        id = 0;

    }
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee[name = "+name+" id = "+ id+ " Salary = "+ calculateSalary() +"]";
    }
}
