package gr11review.part1;

import java.io.*;

public class Review5{
    public static void main(String[] args) throws IOException{
        BufferedReader invest = new BufferedReader(new InputStreamReader(System.in));

        int intYears;
        double dblTarget;
        double dblRate;
        double dblTotal;
        int intTime;

        dblTotal = 0;
        intTime = 0;

        System.out.print("Enter the yearly invested amount: ");
        intYears = Integer.parseInt(invest.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblRate = Double.parseDouble(invest.readLine());

        System.out.print("Enter the target amount: ");
        dblTarget = Double.parseDouble(invest.readLine());

        for(double i = 0; i < dblTarget;){
            dblTotal += 100; 
            dblTotal = dblTotal + ((dblRate / 100) * dblTotal); 
            intTime += 1;
            i = dblTotal;
        }

        System.out.println("The target amount will be earned in " + intTime + " years.");
    }
}