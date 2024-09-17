package gr11review.part1;

import java.io.*;
/**
 * The program Review3 class is a program the prints all the odd numbers between 20 - 100.
 * Then the program prints all numbers descending from 29 - 2. 
 * The two parts of the program also have a space printed beteween them.
 * 
 * This program makes use of a while loop to count up to 100 from 20 and down from 29 to 2.
 * The while loop also allows the program to check for an odd number every time it counts up by one.
 * 
 * @author Evan Wu 
 */

public class Review3{
    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{

        //Declaring and initializing variables
         int intCount = 21;
        
         //While loop that counts up from 20 - 100 and checks for odd numbers each time
         while(intCount <= 100){ 
            if(intCount % 2 > 0){
                //outputting the number if it is odd
                System.out.println(intCount);
            }
            intCount += 1;
         }

         //space to separate program
         System.out.println();

         //while loop that counts down and prints the numbers from 29 - 2
         intCount = 29; 
         while(intCount >= 2){ 
            System.out.println(intCount);
            intCount -= 1;
         }

    }
}