package com.bhavesh.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PayRollSystem {

    Scanner sc = new Scanner(System.in);
//    Set<FullTimeEmp> s1=new HashSet<FullTimeEmp>();
    public ArrayList<Employee> employeeList;

    public PayRollSystem(){
        employeeList = new ArrayList<Employee>();

    }

    public void addEmployee(String name,int id,double sal){


        Employee f1=new FullTimeEmp(name,id,sal);
        employeeList.add(f1);
        System.out.println("Employee added successfully...");

    }



    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee emp : employeeList){
            if(emp.getId() == id){
//                employeeToRemove= emp;
                employeeList.remove(emp);
                System.out.println("Employee data remove successfully...\n\n");
                break;

            }
        }

//        if(employeeToRemove != null){
//            employeeList.remove(employeeToRemove);
//        }
//        else{
//            System.out.println("Employee Not Exist");
//        }
    }




    public void  displayEmployees(){
    	System.out.println("*********************************************************\ns");
        System.out.println("Employee Data in the system : \n");
        
        for (Employee emp: employeeList) {
            System.out.println(emp);
        }
        System.out.println("*********************************************************\n");   
    }
    
}
