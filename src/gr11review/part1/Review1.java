package gr11review.part1;

import java.io.*;

public class Review1{

    public static void main(String[] args) throws IOException{
        BufferedReader month = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader day = new BufferedReader(new InputStreamReader(System.in));


        int intMonth; 
        int intDay;
        int intDays;

        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(month.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(day.readLine());

        if(intMonth == 1){
            intDays = intDay;
            System.out.print(intDays);
        }else if(intMonth == 2){
            intDays = intDay + 31;
            System.out.print(intDays);
        }else if(intMonth == 3){
            intDays = intDay + 59;
            System.out.print(intDays);
        }else if(intMonth == 4){
            intDays = intDay + 90;
            System.out.print(intDays);
        }else if(intMonth == 5){
            intDays = intDay + 121;
            System.out.print(intDays);
        }else if(intMonth == 6){
            intDays = intDay + 151;
            System.out.print(intDays);
        }else if(intMonth == 7){
            intDays = intDay + 182;
            System.out.print(intDays);
        }else if(intMonth == 8){
            intDays = intDay + 213;
            System.out.print(intDays);
        }else if(intMonth == 9){
            intDays = intDay + 243;
            System.out.print(intDays);
        }else if(intMonth == 10){
            intDays = intDay + 274;
            System.out.print(intDays);
        }else if(intMonth == 11){
            intDays = intDay + 304;
            System.out.print(intDays);
        }else if(intMonth == 12){
            intDays = intDay + 3351;
            System.out.print(intDays);
        }

    }
}
