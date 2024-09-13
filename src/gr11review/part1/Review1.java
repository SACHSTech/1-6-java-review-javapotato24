package gr11review.part1;

import java.io.*;

public class Review1{

    public static void main(String[] args) throws IOException{
        BufferedReader date = new BufferedReader(new InputStreamReader(System.in));


        int intMonth; 
        int intDay;
        int intDays = 0;
        int[] intArrCalendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(date.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(date.readLine());

        for (int i = 0; i < intMonth - 1; i++){
            intDays += intArrCalendar[i];
        }

        intDays += intDay;
        System.out.println(intDays);
    }
}
