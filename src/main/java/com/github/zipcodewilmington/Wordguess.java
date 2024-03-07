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

        Boolean wordGuessed = false;

//        choose a random word from a list
        String secretWord = generateRandomWord(wordArray);
        StringBuilder guesses = new StringBuilder(secretWord.length());
        guesses.append("_".repeat(secretWord.length()));


//        while (you want to play) { //outer loop
        while(true){
//            start the game
            announceGame();
//            set word guessed to false
            isWordGuessed(wordGuessed);
//            while (the word isn't guessed) { //inner loop
            while (true){
//            print the current game state
                printCurrentState(guesses);
//            ask for a guess (a single letter)
                char guess = getNextGuess();
//            check the letter against the word
                if(secretWord.contains(guess+"")){

                    int index = secretWord.indexOf(guess);
                    guesses.setCharAt(index, guess);
                    System.out.println("Letter is in the word");
                };
//            using the two character arrays discussed above
//            increment the number of guesses
//
//            if the word is guessed
//            player won, congrats
//
//            if too many guesses
//            player lost, too bad, quit game
        }
//        ask if player wants to play again
      }
//    display game over

    }


    //    announce_game() prints a welcome
    public void announceGame(){
        System.out.println("Let's Play Wordguess version 1.0");
    }

    //    game_over() prints "game over"
    public void gameOver(){
        System.out.println("Game Over!");
    }

    //    initialize_game_state() sets up char[] for secret word and guesses
    public void initializeGameState(){}

    //    get_next_guess() returns a char from player input
    public char getNextGuess(){
        System.out.println("Enter a letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }

    //    is_word_guessed() returns boolean
    public boolean isWordGuessed(boolean input){
        boolean wordGuessed = input;
        return wordGuessed;
    }

    //    ask_to_play_again() returns boolean
    public boolean askToPlayAgain(){
        System.out.println("Would you like to play again?\t(yes / no)");
        String userInput = scanner.nextLine();
        if(userInput == "yes"){
            return true;
        }else return false;
    }

    //    print_current_state() uses printArray to show player where they are at
    public void printCurrentState(StringBuilder guesses){
        System.out.println(guesses.toString());
    }
    //    process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found

    //    player_won() prints happy message
    public void playerWon(){
        System.out.println();
    }

    //    player_lost() print sad message
    public void playerLost(){
        System.out.println();
    }

    public String generateRandomWord(String[] words){
        Random random = new Random();
        int randomNumber = random.nextInt(4+1);
        String magicWord = words[randomNumber];
        return magicWord;
    }
}




