// from this class, user gives input for whole game

// imported needed libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class GameInput {

    // scanner object
    private final Scanner sc = new Scanner(System.in);

    // method to take answer input
    public int getIntegerInput() {

        while(true) {
            try {
                System.out.print("Enter Your Guess: ");
                guess = sc.nextInt();

            } catch(InputMismatchException e) {

                System.out.println("Given input is not a valid number!");
                sc.nextLine();
                continue;
            }
        }
    }

    // method to take replay input
    public String getYesNoInput() {

    }
    
}