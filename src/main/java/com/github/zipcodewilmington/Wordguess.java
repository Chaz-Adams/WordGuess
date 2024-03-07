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

    public Wordguess() {} // Default Constructor

    private void runGame() {
        String[] wordArray = {"cat","dog","horse","monkey","cow"};

        String secretWord = generateRandomWord(wordArray);
        StringBuilder guesses = new StringBuilder(secretWord.length());

        guesses.append("_".repeat(secretWord.length()));
        int numberOfAllowedGuesses = secretWord.length();

        while(numberOfAllowedGuesses > 0){
            announceGame();
            printCurrentState(guesses);

            char guess = getNextGuess();

            if(secretWord.contains((String.valueOf(guess)))){
                int index = secretWord.indexOf(guess);
                guesses.setCharAt(index, guess);
            }

            numberOfAllowedGuesses--;
            System.out.println("Number of guesses left: "+numberOfAllowedGuesses);

            if(secretWord.equals(guesses.toString())){
                playerWon();
                if(!askToPlayAgain()){
                    break;
                }
            }

            if (numberOfAllowedGuesses <= 0){
                playerLost();
                if(!askToPlayAgain()){
                    break;
                }
            }
        }
        gameOver();
    } //Run game


    //    announce_game() prints a welcome
    public void announceGame(){
        System.out.println("Let's Play Wordguess version 1.0");
    }

    //    game_over() prints "game over"
    public void gameOver(){
        System.out.println("Game Over!");
    }

    //    get_next_guess() returns a char from player input
    public char getNextGuess(){
        System.out.println("Enter a letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }

    //    ask_to_play_again() returns boolean
    public boolean askToPlayAgain(){
        System.out.println("Would you like to play again?\t(yes / no)");
        String userInput = scanner.nextLine();
        if(userInput.equals("yes")){
            return true;
        }else return false;
    }

    //    print_current_state() uses printArray to show player where they are at
    public void printCurrentState(StringBuilder guesses){
        System.out.println(guesses.toString());
    }

    //    player_won() prints happy message
    public void playerWon(){
        System.out.println("You won!");
    }

    //    player_lost() print sad message
    public void playerLost(){
        System.out.println("You lost!");
    }

    public String generateRandomWord(String[] words){
        Random random = new Random();
        int randomNumber = random.nextInt(4+1);
        String magicWord = words[randomNumber];
        return magicWord;
    }
}




