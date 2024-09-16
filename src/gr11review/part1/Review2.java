package gr11review.part1;

import java.io.*;
/**
 * The program Review2 class gives the user a list of 4 different jokes to pick from and describes 
 * the theme of the joke to the user. The program then outputs a different joke based on the uesr input
 * 
 * This program makes use of switch cases to determin which joke to oputput basesd on the input from the user
 * 
 * @author Evan Wu 
 */

public class Review2{
    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguemnts (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));

        //initializing the variables
        int intMenu;

        //Outputing menu option to the user 
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        
        //getting user input 
        System.out.print("Choose a menu option: ");
        intMenu = Integer.parseInt(menu.readLine());

        //using switch case to determin user input and then outputting a joke to the user based on 
        //option chosen
        switch(intMenu){
            case 0:
                System.out.println("Why do bees have sticky hair? \nThey always use honeycombs. ");
                break;
            case 1:
                System.out.println("What do frogs wear on their feet? \nOpen-toed sandals.");
                break;
            case 2:
                System.out.println("What do old sheep use to keep their hands warm? \nMuttons.");
                break;
            case 3:
                System.out.println("Why was the teacher wearing sunglasses in the classroom? \nBecause the class was so bright.");
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }
    }
}