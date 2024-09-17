package gr11review.part1;

import java.io.*;

/**
 * The program Review1 class tells the user to input a month and day 
 * then the program will calculate the exact day number for the year on that date 
 * when the date is not a leap year.
 * 
 * The program makes use of an array to store the different lengths of each month and 
 * takes user input to find the total number of days that have passed before the date entered
 * 
 * @author Evan Wu 
 */

public class Review1{

/**
 * Main method to execute the program logic.
 * 
 * @param args Command-line arguemnts (not used).
 * @throws IOException If there is an error during input.
 */
    public static void main(String[] args) throws IOException{
        BufferedReader date = new BufferedReader(new InputStreamReader(System.in));

        //Declaring and initializing variables 
        int intMonth; 
        int intDay;
        int intDays = 0;
        int[] intArrCalendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //User input and storing it in variables
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(date.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(date.readLine());
        
        //Calculating the exact day of the year using array
        for (int i = 0; i < intMonth - 1; i++){
            intDays += intArrCalendar[i];
        }

        intDays += intDay;

        //Outputing the date to the user
        System.out.println(intDays);
    }
}
