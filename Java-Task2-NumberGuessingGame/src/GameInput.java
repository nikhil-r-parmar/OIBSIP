// from this class, user gives input for whole game

// imported needed libraries
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameInput {

    // scanner object
    private final Scanner sc = new Scanner(System.in);

    // method to take answer input
    public int getIntegerInput() {

        int guess = 0;

        while(true) {
            try {
                // takes input of user's guessed number
                System.out.println("||\t\t\t\t\t||");
                System.out.println("|| ENTER YOUR GUESS\t\t\t||");
                System.out.print("|| >> ");
                guess = sc.nextInt();
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||======================================||");



                // checkes if input is in given range 
                if (guess < 1 || guess > 100) {
                    System.out.println("||\t\t\t\t\t||");
                    System.out.println("|| Enter a Number between 1 & 100.\t||");
                    System.out.println("||\t\t\t\t\t||");
                    System.out.println("||======================================||");
                    continue;

                }

                // return's guessed number
                return guess;

            } catch(InputMismatchException e) {

                // shows messege if user enters invalid input
                System.out.println("||\t\t\t\t\t||");
                System.out.println("|| Please Enter a valid Number.\t\t||");
                System.out.println("||\t\t\t\t\t||");
                System.out.println("||======================================||");
                sc.nextLine();
                continue;
            }
        }

    }

    // method to take replay input
    public String getYesNoInput() {

        String ip;

        // feature if user want's to play again

        System.out.println("||\t\t\t\t\t||");
        sc.nextLine(); // consume leftover newline
        System.out.println("|| PLAY AGAIN? [YES/NO]: \t\t||");
        System.out.print("|| >> ");
        ip = sc.nextLine().trim().toLowerCase();
        System.out.println("||\t\t\t\t\t||");
        System.out.println("||======================================||");

        while (!ip.equals("yes") && !ip.equals("no")) {

            System.out.println("||\t\t\t\t\t||");
            System.out.println("|| Please enter yes or no:\t\t||");
            System.out.print("|| >> ");
            ip = sc.nextLine().trim().toLowerCase();
            System.out.println("||\t\t\t\t\t||");
            System.out.println("||======================================||");

        }

        return ip;

    }
    
}