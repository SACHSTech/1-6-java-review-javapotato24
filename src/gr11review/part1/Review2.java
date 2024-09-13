package gr11review.part1;

import java.io.*;

public class Review2{
    public static void main(String[] args) throws IOException{
        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));

        int intMenu;

        // System.out.print("0 - print a joke about your hair" + '\n' + "1 - print a joke about your feet" + '\n' + "2 - print a joke about your clothes" + '\n' +"3 - print a joke about your teacher" + '\n');
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        
        System.out.print("Choose a menu option: ");
        intMenu = Integer.parseInt(menu.readLine());

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