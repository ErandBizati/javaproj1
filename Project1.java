/************************************************************/
/* Author: Erand Bizati
/* Major: CS
/* Creation Date: February 18, 2013 
/* Due Date: Feb, 9, 2024
/* Professor Name: Hallie Langley
/* Filename: Project1
/************************************************************/

// Import the Scanner class to read input from the console.
import java.util.Scanner;

public class Project1 {

    // The main method - entry point of the Java program.
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name and read the input as a String.
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Prompt the user for the number of small sandwiches sold and read the input as an int.
        System.out.println("Enter number of small sandwiches sold:");
        int smalls = scanner.nextInt();

        // Prompt for the number of large sandwiches sold and read the input as an int.
        System.out.println("Enter number of large sandwiches sold:");
        int larges = scanner.nextInt();

        // Prompt for the number of combos sold and read the input as an int.
        System.out.println("Enter number of combos sold:");
        int combos = scanner.nextInt();

        // Calculate and print the output based on the inputs received.
        printOutput(name, smalls, larges, combos);
    }

    // Method to calculate the total sales amount based on the number of sandwiches sold.
    private static float calculateTotal(int smalls, int larges, int combos) {
        // Prices for each type of sandwich.
        final float smallPrice = 7.5f;
        final float largePrice = 10.5f;
        final float comboPrice = 11.5f;
        
        // Calculate total sales by multiplying the number of sandwiches by their respective prices and summing them up.
        return (smallPrice * smalls) + (largePrice * larges) + (comboPrice * combos);
    }

    // Method to print the detailed output including total sales and funds distribution.
    private static void printOutput(String name, int smalls, int larges, int combos) {
        // Calculate total sales.
        float totalSales = calculateTotal(smalls, larges, combos);
        // Calculate funds raised for the club (20% of total sales).
        float clubFunds = totalSales * 0.2f;
        // Calculate the amount to be paid to Mark's Sandwich Shop (80% of total sales).
        float marksAmount = totalSales * 0.8f;
        
        // Print out the detailed report.
        System.out.println("Club Member: " + name);
        System.out.println("Small Vouchers Sold: " + smalls);
        System.out.println("Large Vouchers Sold: " + larges);
        System.out.println("Combo Vouchers Sold: " + combos);
        System.out.printf("Total Voucher Sales: $%.2f\n", totalSales);
        System.out.printf("Funds Raised for Club: $%.2f\n", clubFunds);
        System.out.printf("Amount to Pay Mark's: $%.2f\n", marksAmount);
    }
}
