package gr11review.part1;


import java.io.*;

public class Review7{
    public static void main(String[] args) throws IOException{
        BufferedReader sentence = new BufferedReader(new InputStreamReader(System.in));

        String strSentence = sentence.readLine();

        int intLength = strSentence.length();
        int intSpaces = 0;
        int intOdd = 0;
        int intA = 0;
        String strLetter;
        
        for(int i = 0; i < intLength; i++ ){ 
            strLetter = strSentence.substring(i , intLength);
            if(strSentence.charAt(i) == ' '){
                intSpaces += 1;
            }
            if(i%2 == 0){
                intOdd += 1;
            }   
            if(strSentence.charAt(i) == 'a'){
                intA += 1;
            }
        }

        System.out.println("There are " + intLength + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intA + " letter a in the sentence.");
        for(int i = 0; i < intOdd; i++){
            System.out.print("-");
        }

    }
}