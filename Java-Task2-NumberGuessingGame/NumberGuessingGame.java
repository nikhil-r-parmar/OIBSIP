
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
        
        // PLAYER UI 
        System.out.println("|| NUMBER GUESSING GAME ||");
        System.out.println("- Random Number Generated between 1 to 100.");
        System.out.println("- You have to Guess the number based on hints.");

        String ip = "yes";

        while (ip.equals("yes")) {

            // added variables to store guessed number & attempts.
            int guess = 0, attempts = 0;

            // creating random Number between given range
            int random = rand.nextInt(max-min + 1) + min;


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

                // feature if user want's to play again
                System.out.print("Do you want to play again? (yes/no): ");
                ip = sc.nextLine().toLowerCase();

                if (ip.equals("no")) {
                    System.out.println("GoodBye!");
                    break;
                }

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
