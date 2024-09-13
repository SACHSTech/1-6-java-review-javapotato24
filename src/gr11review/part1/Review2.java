package gr11review.part1;

import java.io.*;

public class Review2{
    public static void main(String[] args) throws IOException{
        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));

        int intMenu;

        System.out.print("0 - print a joke about your hair" + '\n' + "1 - print a joke about your feet" + '\n' + "2 - print a joke about your clothes" + '\n' +"3 - print a joke about your teacher" + '\n');
        
        System.out.print("choose a menu option: ");
        intMenu = Integer.parseInt(menu.readLine());

    }
}