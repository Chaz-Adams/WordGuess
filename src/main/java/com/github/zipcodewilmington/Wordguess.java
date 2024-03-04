package com.github.zipcodewilmington;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math.*;

/**
 * Chaz Adams
 */
public class Wordguess {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Wordguess game = new Wordguess();
        game.runGame();
    }

    public Wordguess() {};

    public String getRandomWord(int randomNumber){

        String[] wordArray = {"Chaz","zipcode","Java","Random","example",
                "wilmington","Guess","spelling","Network","Smile"};

        return wordArray[randomNumber];
    }

    public void runGame() {

        Random r = new Random();
        int random_int = r.nextInt(10) + 1;
        String magicWord = getRandomWord(random_int);
        int numOfTries = 0;
        int allowedTries = magicWord.length();
        boolean isSolved = false;

        System.out.println("Let's Play Wordguess version 1.0");
        char[] solution = magicWord.toCharArray();
        char[] guesses = new char[magicWord.length()];

        for (int i = 0; i < magicWord.length(); i++) {
            System.out.print("- ");
        }



        while (numOfTries < allowedTries && isSolved == false) {
            System.out.println("Current Guesses:");

            String guess = scanner.next();
            if (guess == "-") {
                System.out.println("\n\n\t\tExiting the game..");
                System.exit(0);
            } else guesses = guess.toCharArray();


        }


        System.out.println("Magic Word is: "+magicWord);
        System.out.println("Solution Array: "+solution.toString());
        System.out.println("Guesses: "+ guesses.toString());


    }

    public void underScores(String randomWord){

    }

    public String newUnderScoreWord(){
        return null;
    }

    public int isGuessCorrect(char userGuess, String magicWord){
        int correctUserGuess = 0;

        char[] charArray = magicWord.toCharArray();
        for(int i = 0; i < magicWord.length(); i++){
            if(charArray[i] == userGuess){
                System.out.println("That letter is in the word!");
                correctUserGuess = i;
                System.out.println("Found in index: "+correctUserGuess);
            }else {
                System.out.println("That letter is NOT in the word!");
                // go back to loop and say something about wrong guess
            }
        }
        return correctUserGuess;
    }



}




