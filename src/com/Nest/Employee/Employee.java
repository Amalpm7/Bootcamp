package com.Nest.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> empList = new ArrayList<>();

        while (true){
            System.out.println("Select an option");
            System.out.println("1. Add Employee ");
            System.out.println("2. View Employee");
            System.out.println("3. Exit");

            Scanner opt =new Scanner(System.in);
            choice=opt.nextInt();



            switch (choice){
                case 1:
                    System.out.println("Enter the name of employee");
                    empName = opt.next();
                    empList.add(empName);
                    break;
                case 2:
                   if (empList.size()==0)
                   {
                       System.out.println("No employees added");
                   }
                   else {
                       System.out.println(empList);
                   }
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}


