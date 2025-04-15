package com.pluralsight;

public class MathApp {
    public static void main (String [] args) {

        // Question 1:
        // declare variables here
        double bobSalary = 92000, garySalary = 100000;
        // then code solution
        double highestSalary = Math.max (bobSalary, garySalary);
        // then use System.out.println() to display results
        System.out.println(
                "The highest salary is " + highestSalary + " dollars per year.");
        // ex: System.out.println("The answer is" + answer) ;
        //REPEAT FOR NEXT EXERCISE

        //Question 2:
        double carPrice = 50000, truckPrice = 75000;

        double lowestPrice = Math.min (carPrice, truckPrice);

        System.out.println(
                "The lowest priced vehicle cost " + lowestPrice + " dollars to own.");

        //Question 3:
        double radius = 7.25;
        double area = Math.PI * Math.pow( radius, 2);
        System.out.println(
              "The area of the circle is " + area +"."
        );

    }

}
