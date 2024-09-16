package gr11review.part1;


import java.io.*;
import java.text.DecimalFormat;

public class Review6{

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException{
        BufferedReader items = new BufferedReader(new InputStreamReader(System.in));

        double dblPrice;
        double dblTotal; 
        double dblTax;
        double dblFinalTotal; 

        dblTotal = 0; 
        
        System.out.print("Enter the price for an item: ");
        dblPrice = Double.parseDouble(items.readLine());
        dblTotal += dblPrice;

       while(dblPrice > 0){
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(items.readLine());
            dblTotal += dblPrice;
       }

        dblTax = dblTotal * 0.13;
        dblFinalTotal = dblTotal + dblTax;
        System.out.println("Subtotal: $" + df.format(dblTotal));
        System.out.println("Tax: $"+ df.format(dblTax));
        System.out.println("Total: $" + df.format(dblFinalTotal));

    }
}