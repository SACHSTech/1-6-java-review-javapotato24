package gr11review.part1;


import java.io.*;
import java.text.DecimalFormat;

/**
 * The program Review6 is another program that asks users how many items they wish to scan and 
 * calculates the total, tax and final total price based on the prices of the items inputted by the user. 
 * However, this program will repeat until the user inputs a 0 for the price of the item instead of asking the user
 * how many items they wish to scan. 
 * 
 * This program makes use of java DeciamFormat to round double variables eto 2 decimal places to 
 * show accurate prices to the user. 
 * @author Evan Wu 
 */

public class Review6{

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
        double dblPrice;
        double dblTotal; 
        double dblTax;
        double dblFinalTotal; 

        dblTotal = 0; 
        
        //getting user input for first item
        System.out.print("Enter the price for an item: ");
        dblPrice = Double.parseDouble(items.readLine());
        dblTotal += dblPrice;

        //while lopp that repeatedly asks user for price of an item until they input 0 
       while(dblPrice > 0){
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(items.readLine());
            dblTotal += dblPrice;
       }

        //calculating the tax and final total and outtputing it to the user
        dblTax = dblTotal * 0.13;
        dblFinalTotal = dblTotal + dblTax;
        System.out.println("Subtotal: $" + df.format(dblTotal));
        System.out.println("Tax: $"+ df.format(dblTax));
        System.out.println("Total: $" + df.format(dblFinalTotal));

    }
}