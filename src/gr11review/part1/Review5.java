package gr11review.part1;

import java.io.*;

/**
 * The program Review5 is a program that calculates the time in years it takes for the users money
 * to reach a goal amount based on an inputted compound interest rate and a yearly investment rate.
 * 
 * The program makes use of a for loop to calcuate the amount of money added each year
 * until the goal amount is reached.
 * @author Evan Wu 
 */

public class Review5{
    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader invest = new BufferedReader(new InputStreamReader(System.in));

        //Declaring and initializing variables
        double dblYearly_amount;
        double dblTarget_amount;
        double dblCompound_interest_rate;
        double dblTotal;
        int intTime;

        dblTotal = 0;
        intTime = 0;

        //getting user input for their yearly investment, the compound interest rate and the target amount
        System.out.print("Enter the yearly invested amount: ");
        dblYearly_amount = Double.parseDouble(invest.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblCompound_interest_rate = Double.parseDouble(invest.readLine());

        System.out.print("Enter the target amount: ");
        dblTarget_amount = Double.parseDouble(invest.readLine());

        //for loop that will repeat unitl the target amount of money is reached 
        for(double i = 0; i < dblTarget_amount;){
            //calculations for yearly compound interest based on interest rate and yearly investment by uesr
            dblTotal += dblYearly_amount; 
            dblTotal = dblTotal + ((dblCompound_interest_rate / 100) * dblTotal); 
            intTime += 1;
            i = dblTotal;
        }

        //outputting the time in years it will take to reach target amount
        System.out.println("The target amount will be earned in " + intTime + " years.");
    }
}