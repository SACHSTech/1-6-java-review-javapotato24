package gr11review.part1;


import java.io.*;

public class Review7{
    public static void main(String[] args) throws IOException{
        BufferedReader sentence = new BufferedReader(new InputStreamReader(System.in));

        String strSentence = sentence.readLine();

        int intLength = strSentence.length();
        String strLetter;
        
        for(int i = 0; i < intLength; i++ ){ 
            strLetter = strSentence.substring(i , intLength);
            if(strLetter == " "){
                
            }
        }

    }
}