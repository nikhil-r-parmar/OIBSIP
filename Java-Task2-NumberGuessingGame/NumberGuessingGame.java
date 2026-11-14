
// Java Development Intern Task - 2
// Number Guessing Game
// Author : Nikhil R. Parmar

// imported needed libraries
import java.util.Random;
import java.util.Scanner;

// main function 
public class NumberGuessingGame {
    public static void main(String[] args) {

        // Scanner class used
        Scanner sc = new Scanner(System.in);
        // random number generator class object creation
        Random rand = new Random();

        // defining range of random number;
        int min = 1, max = 100;

        // creating random Number between given range
        int random = rand.nextInt(max-min + 1) + min;

        
        // PLAYER UI 
        System.out.println("|| NUMBER GUESSING GAME ||");
        System.out.println("- Random Number Generated between 1 to 100.");
        System.out.println("- You have to Guess the number based on hints.");

        // added variables to store guessed number & attempts.
        int guess = 0, attempts = 0;

        // take user guesses unitil it matches random number
        while (guess != random) {
            
            System.out.print("Enter Your Guess: ");
            guess = sc.nextInt();

            // input validation
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid Input! Enter a Number between 1 & 100.");
                continue;
            }

            // attempt updates
            attempts++;

            if (guess == random) {

                // User output after Correct Guessed.
                System.out.println("Congratulations! You guessed correct!");
                System.out.println("Your attempts: " + attempts);

            } else if (guess > random) {

                // User output if guess is higher than number 
                System.out.println("Your Guess is too high!");

            } else if (guess < random) {

                // User output if guess is lower than number 
                System.out.println("Your Guess is too low!");
            }

        }

        // closing scanner class
        sc.close();
        
    }
}
