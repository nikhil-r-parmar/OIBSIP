
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
        // created object of account class
        Account acc = new Account();

        // initiallized account class variables
        acc.userId = "NIKHIL101";
        acc.pin = 1234;
        acc.balance = 5000.0;

        System.out.println("===== ACCOUNT DETAILS =====");
        System.out.println("User ID: " + acc.userId);
        System.out.println("Balance: " + acc.balance);

    }
}