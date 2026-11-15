// from this class, user gives input for whole game

// imported needed libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class GameInput {

    // scanner object
    private final Scanner sc = new Scanner(System.in);

    // method to take answer input
    public int getIntegerInput() {

        int guess;

        while(true) {
            try {
                // takes input of user's guessed number
                System.out.print("Enter Your Guess: ");
                guess = sc.nextInt();

                // return's guessed number
                return guess;

            } catch(InputMismatchException e) {

                // shows messege if user enters invalid input
                System.out.println("Given input is not a valid number!");
                sc.nextLine();
                continue;
            }
        }

        return;
    }

    // method to take replay input
    public String getYesNoInput() {

    }
    
}