package number_game;


import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;   // Set the lower bound of the random number
        int upperBound = 100; // Set the upper bound of the random number
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess a number within the valid range.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                break;
            }
        }
        
        scanner.close();
    }
}
