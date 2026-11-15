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

    }

    // method to take replay input
    public String getYesNoInput() {

        String ip;

        // feature if user want's to play again

        sc.nextLine(); // consume leftover newline
        System.out.print("Do you want to play again? (yes/no): ");
        ip = sc.nextLine().trim().toLowerCase();

        while (!ip.equals("yes") && !ip.equals("no")) {
            System.out.print("Please enter yes or no: ");
            ip = sc.nextLine().trim().toLowerCase();

        }

        return ip;

    }
    
}