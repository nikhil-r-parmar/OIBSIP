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

}