// this class handles main number guessing game logic


// imported needed libraries
import java.util.Random;

public class GameManager {
    
    // creating object of game input class 
    private GameInput input = new GameInput();

    // random number generator class object creation
    private Random rand = new Random();

    // defining range of random number;
    private int min = 1, max = 100;

    // added variables to store guessed number & attempts.
    private int guess = 0, attempts = 0;

    // method that generate's random number 
    private int generateRandomNumber() {
        // creating random Number between given range
        int random = rand.nextInt(max-min + 1) + min;

        return random;
    }

    // this method contains game logic
    public void startGame() {

        // reset's attempts to zero
        attempts = 0;
        guess = 0;

        //calling random number method
        int random = generateRandomNumber();

        String playagain = "yes";   // added default play input

        // PLAYER INTERFACE
        System.out.println("|| NUMBER GUESSING GAME ||");
        System.out.println("- Random Number Generated between 1 to 100.");
        System.out.println("- You have to Guess the number based on hints.");


        while ()
        while (guess != random) {

            if (guess > random) {

                // User output if guess is higher than number 
                System.out.println("Your Guess is too high!");

            } else if (guess < random) {

                // User output if guess is lower than number 
                System.out.println("Your Guess is too low!");
                
            }

            // user guessed input 
            guess = input.getIntegerInput();

            // attempts updation    
            attempts++;

        } 

        // User output after Correct Guessed.
        System.out.println("Congratulations! You guessed correct!");
        System.out.println("Your attempts: " + attempts);
        input.getYesNoInput();

    }

}