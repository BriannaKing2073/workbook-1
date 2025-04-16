package SandwichShop;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    //Ask Sandwich Size
        System.out.println("What sized Sandwich would you like today?\n Regular($5.45) or Large($8.95)");
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
        //Ask for age
        System.out.println("Enter your age to see if you are eligible for a discount");
        String age = scanner.nextLine();
        
        //discount conditions
        double total = price;

        if (age <= 17);
        {total = price - 0.10;}
        else if (age >= 65 );
        {total = price - 0.20;}
        else {total = price;}

        System.out.println(sandwichSize + " $"+ total);

        }
    }
