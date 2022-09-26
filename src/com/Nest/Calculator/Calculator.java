package com.Nest.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice,a,b;

        while (true){
            System.out.println("Select an option");
            System.out.println("1. Add ");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner opt=new Scanner(System.in);
            choice=opt.nextInt();

            System.out.println("Enter the operands");
            a = opt.nextInt();
            b = opt.nextInt();


            switch (choice){
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    try {
                        System.out.println(a / b);
                    }catch (ArithmeticException ae) {
                    System.out.println("Denominator can't be zero");
                    }
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
