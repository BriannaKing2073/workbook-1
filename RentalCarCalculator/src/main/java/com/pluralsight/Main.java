package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pick Up Date
        System.out.println(" Welcome to Rent-A-Car \nSelect the pick up date for your rental:(Ex.MM/DD/YYYY)");
        String pickUpDate = scanner.nextLine().trim();
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Rental Cost:Can't be calculated yet\n");

        //Number of Rental Days
        System.out.println("Number of days with rental:");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Number of Rental Day(s): "+ rentalDays +
                "\n Rental Cost:Can't be calculated yet\n");

        //Electronic Toll Tag (Code skips this question when running)
        System.out.println("Would you like a Electronic Toll Tag for $3.95/day?(Yes/No)");
        String electronicTollTag = scanner.nextLine();

        double electronicTollTagPrice = 0.0 ;
        if(electronicTollTag.equalsIgnoreCase("Yes")){
            electronicTollTagPrice = rentalDays * 3.95;
        }else{
            electronicTollTag = "No";
            electronicTollTagPrice = electronicTollTagPrice;
        }
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Number of Rental Day(s): "+ rentalDays +
                "\n Electronic Toll Tag: "+ electronicTollTag +
                "\n Rental Cost:Can't be calculated yet\n");

        //GPS
        System.out.println("Would you like a GPS for $2.95/day?(Yes/No)");
        String gps = scanner.nextLine();

        double gpsPrice = 0.0;
        if (gps.equalsIgnoreCase("Yes")){
            gpsPrice = rentalDays * 2.95;
        }else{
            gps = "No";
            gpsPrice = gpsPrice;
        }
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Number of Rental Day(s): "+ rentalDays +
                "\n Electronic Toll Tag: "+ electronicTollTag +
                "\n GPS: "+ gps +
                "\n Rental Cost:Can't be calculated yet\n");

        //Roadside Assistance
        System.out.println("Would you like a Roadside Assistance for $3.95/day?(Yes/No)");
        String roadsideAssistance = scanner.nextLine();

        double roadsideAssistancePrice = 0.0;
        if (roadsideAssistance.equalsIgnoreCase("Yes")){
            roadsideAssistancePrice = rentalDays * 3.95;
        }else {
            roadsideAssistance = "No";
            roadsideAssistancePrice = roadsideAssistancePrice;
        }
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Number of Rental Day(s): "+ rentalDays +
                "\n Electronic Toll Tag: "+ electronicTollTag +
                "\n GPS: "+ gps +
                "\n Roadside Assistance: "+ roadsideAssistance +
                "\n Rental Cost:Can't be calculated yet\n");

        //Age (should I move up and add name?)
        System.out.println("What is your current age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        double baseRentalPrice = 29.99 * rentalDays;
        double baseRentalTotal = 0.0;
        if(age < 25){
          baseRentalTotal  = baseRentalPrice +  1.30;
        }else{
            baseRentalTotal = baseRentalPrice;
        }
        double rentalCost = (electronicTollTagPrice + gpsPrice + roadsideAssistancePrice + baseRentalPrice);
        System.out.println("Your Rental Deatils:\n " +
                "Pick Up Date: "+ pickUpDate +
                "\n Number of Rental Day(s): "+ rentalDays +
                "\n Electronic Toll Tag: "+ electronicTollTag +
                "\n GPS: "+ gps +
                "\n Roadside Assistance: "+ roadsideAssistance +
                "\n Base Rental Cost: "+ baseRentalTotal +
                "\n Rental Cost: " + rentalCost);

    }
}