// this class handles main number guessing game logic


// imported needed libraries
import java.util.ArrayList;
import java.util.Random;

public class GameManager {
    
    // creating object of game input class 
    private final GameInput input = new GameInput();

    // random number generator class object creation
    private final Random rand = new Random();

    // defining range of random number;
    private int min = 1, max = 100;

    // added variables to store guessed number & attempts.
    private int guess = 0, attempts = 0;

    // variable to count maximum attempts
    private static final int MAX_ATTEMPTS = 7;

    // variables that counts total rounds, wins & losses
    private int roundNumber = 0, wins = 0, losses = 0;

    // arraylist that stores history
    private final ArrayList<String> roundHistory = new ArrayList<>();

    // method that generate's random number 
    private int generateRandomNumber() {
        // creating random Number between given range
        int random = rand.nextInt(max-min + 1) + min;

        return random;
    }

    // this method contains game logic
    public void startGame() {

        // increase round count
        roundNumber++;

        String playAgain = "yes";   // added default play input

        // PLAYER INTERFACE
        System.out.println("||======================================||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||\t   NUMBER GUESSING GAME\t\t||");
        System.out.println("||\t       JAVA EDITION\t\t||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||======================================||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("|| Welcome to Number Guessing Game.\t||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("|| Range      : 1 - 100\t\t\t||");
        System.out.println("|| Difficulty : Normal\t\t\t||");
        System.out.println("|| Objective  : Guess the secret number.||");
        System.out.println("|| Developer  : Nikhil Parmar\t\t||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||======================================||");


        while (playAgain.equals("yes")) {

            // reset's attempts to zero
            attempts = 0;
            guess = 0;

            //calling random number method
            int random = generateRandomNumber();
            

            do {

                // user guessed input 
                guess = input.getIntegerInput();

                // attempts updation    
                attempts++;

                System.out.println("||======================================||");
                System.out.println("||\t      GAME STARTED\t\t||");
                System.out.println("||======================================||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("|| Attempts      : " + attempts + "\t\t\t||");
                System.out.println("|| Number Range  : 1 - 100\t\t||");
                System.out.println("||\t\t\t\t\t||");
                

                if (guess > random) {

                    // User output if guess is higher than number 
                    System.out.println("|| Hint: Your Guess is too high!\t||");
                    System.out.println("||\t\t\t\t\t||");
                    System.out.println("||======================================||");

                } else if (guess < random) {

                    // User output if guess is lower than number 
                    System.out.println("|| Hint: Your Guess is too low!\t\t||");
                    System.out.println("||\t\t\t\t\t||");
                    System.out.println("||======================================||");
                
                }

            } while (guess != random && attempts<MAX_ATTEMPTS);

            if (guess == random) {

                // increase win count
                wins++;

                // User output after Correct Guessed.
                System.out.println("||======================================||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||\t        YOU WON\t\t\t||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||\t  Correct Guess: " + guess + "\t\t||");
                System.out.println("||\t  Total Attempts: " + attempts + "\t\t||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||======================================||");

            } else {

                // increase loose count
                losses++;
                
                // User output after maximum attemps reach without correct Guess.
                System.out.println("||======================================||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||\t       YOU LOST\t\t\t||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||\t  Correct Number: " + random + "\t\t||");
                System.out.println("||\t  Total Attempts: " + attempts + "\t\t||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||======================================||");

            }

            playAgain = input.getYesNoInput();

        }

        System.out.println("||======================================||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||\t   THANKS FOR PLAYING\t\t||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||\t      GAME CLOSED\t\t||");
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||======================================||");
        

    }

}