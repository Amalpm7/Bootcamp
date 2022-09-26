package com.Nest.Employee;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;

        while (true){
            System.out.println("Select an option");
            System.out.println("1. Add Employee ");
            System.out.println("2. View Employee");
            System.out.println("3. Exit");

            Scanner opt=new Scanner(System.in);
            choice=opt.nextInt();



            switch (choice){
                case 1:
                    System.out.println("Add employee");
                    break;
                case 2:
                    System.out.println("View employee");
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}


