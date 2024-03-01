package com.github.zipcodewilmington;

import java.util.Scanner;
import java.lang.Math.*;

/**
 * Chaz Adams
 */
public class Wordguess {

    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        String userGuess;
//        int numOfGuesses = 4;
//
//        while(numOfGuesses <6){
//            /*
//             I need to set up an array and then search through the array
//             if it matches one of the elements in the array we need to replace
//             the element position '_' with the letter
//             after every guess check to see if the word is complete or if ran out
//             of guesses
//
//             I want to have  the loop call methods such as the menu or the compare etc.*/
//            System.out.print("Let's Play Wordguess version 1.0");
//            System.out.println("Current Guesses: ");
//            System.out.println("_ _ _ _");
//            System.out.println("You have "+numOfGuesses+" tries left.");
//            System.out.println("Enter a single character: ");
//
//            //write some exception handling incase its more than one char
//            userGuess = scanner.next();
        //}

        Wordguess main = new Wordguess();

        int randomNumber = main.getRandomNumber();
        String randomWord = main.getRandomWord(randomNumber);

        main.runGame(randomWord);



        System.out.println(randomWord);

    }

    public  int getRandomNumber(){
        int max = 10;
        int min = 1;
        // Generate random number within the range
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getRandomWord(int randomNumber){

        String[] wordArray = {"Chaz","zipcode","Java","Random","example",
                "wilmington","Guess","spelling","Network","Smile"};

        return wordArray[randomNumber];
    }

    public void runGame(String randomWord){
        int numberOfTries = randomWord.length()+3;

        System.out.println("Let's Play Wordguess version 1.0");
        System.out.println("Current Guesses:");
        underScores(randomWord);
        System.out.println();
        System.out.println("You have "+numberOfTries+" tries left.");
        System.out.println("Enter a single character: ");

    }

    public void underScores(String randomWord){
        for(int i = 0; i < randomWord.length();i++){
            System.out.print("_");
        }
    }

}
