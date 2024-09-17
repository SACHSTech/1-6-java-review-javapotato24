package gr11review.part1;


import java.io.*;
/**
 * The program Review7 is designed to take in a user inputted sentence and output the number of characters,
 * number of letter "a"s in the sentence and the number of spaces. The program will also output a "-" whenever 
 * the character is odd.
 * 
 * This program makes use of for loops and charAt() to check each character in the sentence to see if it 
 * is either a space or the letter "a". This program also uses a for loop to count the total number of odd characters
 * and output a "-" for each of them.
 * @author Evan Wu 
 */

public class Review7{
     /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader sentence = new BufferedReader(new InputStreamReader(System.in));

        //getting user inputted sentence
        String theSentence = sentence.readLine();

        //declaring and initializing variables
        int intLength = theSentence.length();
        int intSpaces = 0;
        int intOdd = 0;
        int intA = 0;
        
        //for loop to check each character in the sentence 
        for(int i = 0; i < intLength; i++ ){ 
            //if statements that check for spaces, letter "a", or odd characters
            if(theSentence.charAt(i) == ' '){
                intSpaces += 1;
            }
            if(i%2 == 0){
                intOdd += 1;
            }   
            if(theSentence.charAt(i) == 'a'){
                intA += 1;
            }
        }

        //outputting the length of the sentence, number of spaces and number of letter "a"s
        System.out.println("There are " + intLength + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intA + " letter a in the sentence.");

        //for loop that prints out "-" for each odd character in the sentence
        for(int i = 0; i < intOdd; i++){
            System.out.print("-");
        }

    }
}