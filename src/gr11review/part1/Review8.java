package gr11review.part1;


import java.io.*;
import java.util.Random;

public class Review8{
    public static void main(String[] args) throws IOException{
        
        Random rand = new Random();
        int intNum1;
        int intNum2;
        int intNum3;
        int intTriple = 0;

        for(int i = 0; i < 1000; i++){
            intNum1 = rand.nextInt(8);
            intNum2 = rand.nextInt(8);
            intNum3 = rand.nextInt(8);

            if( intNum1 == intNum2 && intNum2 == intNum3){
                intTriple += 1;
            }

            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);
        }
        System.out.println(intTriple);

    }
}