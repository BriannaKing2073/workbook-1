package com.pluralsight;


import java.util.Scanner;

public class BasicCalulator {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

       //need to print out statement to trigger each prompt
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        //Enter the first number: 5
        System.out.println("Enter the second number");
        //Enter the second number: 12
        int num2 = scanner.nextInt();

        System.out.println("Possible Calulations:" +
                "\n(A)dd \n(S)ubtract \n(M)ultiply \n(D)ivide\n"+"Please Select an option");
        String calulations = scanner.nextLine();

        int operation = (num1+ calulations + num2);
        System.out.printf("%d %s %d = %d", num1, calulations, num2,operation);


    }
}
