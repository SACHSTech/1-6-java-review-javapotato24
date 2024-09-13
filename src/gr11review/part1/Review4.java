package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4{

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException{
        BufferedReader items = new BufferedReader(new InputStreamReader(System.in));

        int intItemcount;
        double dblTotal; 
        double dblTax;
        double dblFinalTotal; 

        dblTotal = 0; 

        System.out.print("How many items do you want to buy? ");
        intItemcount = Integer.parseInt(items.readLine());
        
        for(int i = 1; i <= intItemcount; i++){
            System.out.print("Enter the price for item " + i + ": ");
            dblTotal = dblTotal +  Double.parseDouble(items.readLine());
        }

        dblTax = dblTotal * 0.13;
        dblFinalTotal = dblTotal + dblTax;
        System.out.println("Subtotal: $" + df.format(dblTotal));
        System.out.println("Tax: $"+ df.format(dblTax));
        System.out.println("Total: $" + df.format(dblFinalTotal));

    }
}