package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
 * The program Review4 is a program that asks the user how many items they want to purchase and the price of each item.
 * Then the program takes the prices and calculates the total price, tax and final price and outputs all of them to the user
 * 
 * This program makes use of a for loop to repeatedly ask for the item price from the user depending on how 
 * many items they wish to scan. Then it addes the new items price to the total cost. 
 * 
 * This program uses the java Decimal Format to round all double values to 2 deciaml places to show accurate prices
 * 
 * @author Evan Wu 
 */

public class Review4{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader items = new BufferedReader(new InputStreamReader(System.in));

        //declaring and initializing variables
        int intItemcount;
        double dblTotal; 
        double dblTax;
        double dblFinalTotal; 

        dblTotal = 0; 

        //asking user to input the number of items to scan
        System.out.print("How many items do you want to buy? ");
        intItemcount = Integer.parseInt(items.readLine());
        
        //for loop that will repeat until there are no more items left to add 
        for(int i = 1; i <= intItemcount; i++){
            //asking user to input the price of the item and adding it to the total cost
            System.out.print("Enter the price for item " + i + ": ");
            dblTotal = dblTotal +  Double.parseDouble(items.readLine());
        }

        //calculating and outputting the total, tax and final total with tax to the user
        dblTax = dblTotal * 0.13;
        dblFinalTotal = dblTotal + dblTax;
        System.out.println("Subtotal: $" + df.format(dblTotal));
        System.out.println("Tax: $"+ df.format(dblTax));
        System.out.println("Total: $" + df.format(dblFinalTotal));

    }
}