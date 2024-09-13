package gr11review.part1;

import java.io.*;

public class Review3{
    public static void main(String[] args) throws IOException{
         int intCount = 21;
            
         while(intCount <= 100){ 
            if(intCount % 2 > 0){
                System.out.println(intCount);
            }
            intCount += 1;
         }

         System.out.println();

         intCount = 29; 
         while(intCount >= 2){ 
            System.out.println(intCount);
            intCount -= 1;
         }

    }
}