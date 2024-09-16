package gr11review.part1;


import java.io.*;
import java.util.Random;

/**
 * The program Review8 simulates 1000 pulls on a slot machine and outputs them to the user. Then the program
 * also outputs the total number of times the 3 numbers matched eachother in the roll. The available numbers are
 * all between 0 - 8. 
 * 
 * This program makes use of the for loop and the java.Random to randomly select numbers for the spin 1000 different times
 * @author Evan Wu 
 */

public class Review8{
    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        
        //declaring and initializing variables and random
        Random rand = new Random();
        int intNum1;
        int intNum2;
        int intNum3;
        int intTriple = 0;

        //for loop to simulate 1000 pulls of 3 random numbers betewen 0 - 8
        for(int i = 0; i < 1000; i++){
            intNum1 = rand.nextInt(8);
            intNum2 = rand.nextInt(8);
            intNum3 = rand.nextInt(8);

            //if statement that checks if the 3 numbers match each other in the current roll
            if( intNum1 == intNum2 && intNum2 == intNum3){
                intTriple += 1;
            }

            //outputting the rolls to the user 
            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);
        }

        //outputting the number of times all three numbers matched in the 1000 rolls
        System.out.println(intTriple);

    }
}