
// Java Development Intern Task - 3
// ATM Interface
// Author : Nikhil R. Parmar

// imported scanner class
import java.util.Scanner;

// Accont class
class Account {
    // instace variables
    String userId;
    int pin;
    double balance;

}

// main class
public class Main {
    public static void main(String[] args) {
        // creating object of scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // created object of account class
        Account acc = new Account();

        // initiallized account class variables
        acc.userId = "NIKHIL101";
        acc.pin = 1234;
        acc.balance = 5000.0;

        // taking inputs form user
        System.out.println("===== ATM LOGIN =====");
        System.out.print("Enter User ID: ");
        String uid = sc.nextLine();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        // checking if user id and pin matches or not
        if (uid.equals(acc.userId)) {
            if (pin == acc.pin) {
                // prints success if both matches
                System.out.println("Logic Successful!");
                System.out.println("Welcome to " + acc.userId);
                
            } else {
                // print's it if pin doesn't match
                System.out.println("Invalid Pin");

            }
            
        } else {
            // prints it if uid doesn't match
            System.out.println("Invalid User ID");

        }

    }
}