/************************************************************
 * Author: Erand Bizati
 * Major: CS
 * Creation Date: February 18, 2013
 * Due Date: Feb, 9, 2024
 * Professor Name: Hallie Langley
 * Filename: Project1
 ************************************************************/

 import java.util.Scanner;

 public class Project1 {
 
     /**
      * Main method to start the application.
      * Command Line Functionallity, if it fails to read
      * it prompts the user for their name, the number of small, large,
      * and combo sandwiches sold, and prints out the total sales and
      * funds distribution.
      */
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int smalls, larges, combos;

        // Check if the correct number of args are passed
        if (args.length >= 4) {
            // Use command-line args
            name = args[0];
            try {
                smalls = Integer.parseInt(args[1]);
                larges = Integer.parseInt(args[2]);
                combos = Integer.parseInt(args[3]);
            } catch (NumberFormatException e) {
                // In case of format error, print error and exit
                System.out.println("error: make sure that smalls, larges, and combos are ints.");
                return;
            }
        } else {
            // Ask for input via console
            System.out.println("Enter your name:");
            name = scanner.nextLine();

            System.out.println("Enter number of small sandwiches sold:");
            smalls = scanner.nextInt();

            System.out.println("Enter number of large sandwiches sold:");
            larges = scanner.nextInt();

            System.out.println("Enter number of combos sold:");
            combos = scanner.nextInt();
        }

    
        printOutput(name, smalls, larges, combos);
      }

 
     /**
      * Calculates the total sales amount based on the number of
      * sandwiches and combos sold.
      * 
      * @param smalls Number of small sandwiches sold.
      * @param larges Number of large sandwiches sold.
      * @param combos Number of combos sold.
      * @return Total sales amount.
      */
     private static float calculateTotal(int smalls, int larges, int combos) {
         final float smallPrice = 7.5f;
         final float largePrice = 10.5f;
         final float comboPrice = 11.5f;
 
         return (smallPrice * smalls) + (largePrice * larges) + (comboPrice * combos);
     }
 
     /**
      * Prints the detailed output including the club member's name,
      * the number of each type of voucher sold, total voucher sales,
      * funds raised for the club, and the amount to pay to Mark's Sandwich Shop.
      * 
      * @param name Club member's name.
      * @param smalls Number of small vouchers sold.
      * @param larges Number of large vouchers sold.
      * @param combos Number of combo vouchers sold.
      */
     private static void printOutput(String name, int smalls, int larges, int combos) {
         float totalSales = calculateTotal(smalls, larges, combos);
         float clubFunds = totalSales * 0.2f;
         float marksAmount = totalSales * 0.8f;
 
         System.out.println("Club Member: " + name);
         System.out.println("Small Vouchers Sold: " + smalls);
         System.out.println("Large Vouchers Sold: " + larges);
         System.out.println("Combo Vouchers Sold: " + combos);
         System.out.printf("Total Voucher Sales: $%.2f\n", totalSales);
         System.out.printf("Funds Raised for Club: $%.2f\n", clubFunds);
         System.out.printf("Amount to Pay Mark's: $%.2f\n", marksAmount);
     }
 }
 