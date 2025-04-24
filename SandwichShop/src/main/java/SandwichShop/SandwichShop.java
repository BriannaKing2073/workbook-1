package SandwichShop;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    //Ask Sandwich Size
        System.out.println("What sized Sandwich would you like today?\n Regular($5.45) or Large($8.95) \n(Regular/Large):");
        String sandwichSize = scanner.nextLine();
     //Response to Sandwich size
        double price = 0.0;
        if (sandwichSize.equalsIgnoreCase("Regular")) {
            price = 5.45;
        }else if (sandwichSize.equalsIgnoreCase("Large")){
            price = 8.95;
        }else {
            System.out.println("Sorry we don't have that size.");
        }
        System.out.println(sandwichSize +" $" + price);

        //Loaded options
        System.out.println("Would you like a loaded Sandwich?\n Yes or No");
        String loadedSandwich = scanner.nextLine();

        if (sandwichSize.equalsIgnoreCase("Regular") && loadedSandwich.equalsIgnoreCase("Yes")){

            price = 6.45;

        }

       else if (sandwichSize.equalsIgnoreCase("Large") && loadedSandwich.equalsIgnoreCase("Yes")){

           price = 10.70;

       }

        else {
            sandwichSize = sandwichSize;
            price = price;
        }
       System.out.println("Your Order:\n"+ sandwichSize + "\nLoaded: " + loadedSandwich + "\nSubtotal: $" + price);
        //Ask for age
        System.out.println("Enter your age to see if you are eligible for a discount");
        int age = scanner.nextInt();
        //catches Enter
        scanner.nextLine();
        
        //discount conditions
        double total = price;

        if (age <= 17) {
            total = price - 0.10;
            System.out.println("Your Order:\n"+ sandwichSize + "\nLoaded: " + loadedSandwich + "\nTotal: $" + total + "\n 10% Discount");
        }
        else if (age >= 65 ) {
            total = price - 0.20;
            System.out.println("Your Order:\n"+ sandwichSize + "\nLoaded: " + loadedSandwich + "\nTotal: $" + total + "\n20% Discount");
        }
        else {
            total = price;
            System.out.println("Your Order:\n"+ sandwichSize + "\n Loaded: " + loadedSandwich + "\n Total: $" + total);
        }



        }
    }
