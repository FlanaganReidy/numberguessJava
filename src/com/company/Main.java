package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randNum = new Random();
        Integer numToGuess = randNum.nextInt(100)+1;

        boolean guessedIt = false;
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            String userInput = scanner.nextLine();
            guess = Integer.parseInt(userInput);

            System.out.println(userInput);
           if(numToGuess < guess){
                System.out.println("too high");
            }
            else if(numToGuess > guess){
                System.out.println("too low");
            }
            else{
                System.out.println("You got it");
                guessedIt = true;
           }
        } while (guessedIt == false);

    }
}
