package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
     //Setting up scanner
    Scanner scanner = new Scanner(System.in);
        //Asks name -> Enter name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        //Ask Number of Hours worked -> Enter Hours
        System.out.println("How many hours have you worked?");
        int hoursWorked = scanner.nextInt();
        //Identify Pay Rate
        System.out.println( "What is your Pay Rate?");
        int payRate = scanner.nextInt();

        float Pay = hoursWorked * payRate;
        System.out.printf(name + " your pay is " + Pay);

    }
}
