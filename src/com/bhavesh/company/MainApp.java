package com.bhavesh.company;

import java.util.Scanner;

public class MainApp {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        PayRollSystem payrollsystem = new PayRollSystem();

        while(true) {
        System.out.println("*** Employee Payroll System ***");
        System.out.println("=========================================================");
        System.out.println("1.Add Employee details");
        System.out.println("2.Display Employee details");
        System.out.println("3.Remove Employee");
        System.out.println("4.Exist");

        System.out.println("=========================================================");

        int choice;


            System.out.println("Enter your Choice : ");
             choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Employee type : ");
                    System.out.println("1.Full Time Employee");
                    System.out.println("2.Part Time Employee");

                    int type = sc.nextInt();

                    switch (type) {
                        case 1: {

                            System.out.println("Enter the Employee name: ");
                           String name= sc.next()+sc.nextLine();

                            int id = (int)(Math.random()*10+1);

                            System.out.println("Enter the Salary : ");
                           double sal = sc.nextDouble();
                            payrollsystem.addEmployee(name,id ,sal);
                            break;
                        }

                        case 2: {
//                            PartTimeEmp e2 = new PartTimeEmp("Vyankatesh", 102, 40, 500);
                            System.out.println("Enter the Employee name: ");
                            String name = sc.next()+sc.nextLine();

                            //System.out.println("Enter the Employee Id : ");
//                            int id = sc.nextInt();

                            int id = (int)(Math.random()*10+1);

                            System.out.println("Enter the work hour : ");
                            int hour = sc.nextInt();

                            System.out.println("Enter the hourly rate : ");
                            double hrate = sc.nextInt();

                            double sal = hour* hrate;
                            payrollsystem.addEmployee(name, id,sal);
                            break;
                        }
                    }
                    break;
                }

                case 2: {
                    
                    payrollsystem.displayEmployees();
                    
                    break;
                }

                case 3: {
                    System.out.println("Enter the Employee Id to remove : ");
                    int id = sc.nextInt();
                    payrollsystem.removeEmployee(id);
                   
                    break;
                }
                case 4: {
                    System.out.println("Thank You...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Enter the valid choice!");
                }
            }
        }

    }

}
