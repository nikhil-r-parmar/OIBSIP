
// Java Development Intern Task - 3
// ATM Interface
// Author : Nikhil R. Parmar

// imported scanner class
import java.util.Scanner;

// Account class
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

        // initialized account class variables
        acc.userId = "NIKHIL101";
        acc.pin = 1234;
        acc.balance = 5000.0;

        // taking inputs from user
        System.out.println("===== ATM LOGIN =====");
        System.out.print("Enter User ID: ");
        String uid = sc.nextLine();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        // checking if user id and pin matches or not
        if (uid.equals(acc.userId)) {
            if (pin == acc.pin) {
                // prints success if both matches
                System.out.println("Login Successful!");
                System.out.println("Welcome to " + acc.userId);

                // printing atm operations after successful logic
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                // taking user's choice as integer
                System.out.print("\nEnter your choice: ");
                int choice = sc.nextInt();

                // using switch case to perform each operations
                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + acc.balance);
                        break;

                    case 2:
                        // asking user to enter deposit amount
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        //checking whether amount is more than zero or not.
                        if (deposit > 0) {
                            // updating and printing balance
                            acc.balance += deposit;
                            System.out.println("\nDeposit Successful!");
                            System.out.println("Updated Balance: " + acc.balance);

                        } else {
                            System.out.println("Invalid Deposit Amount!");

                        }
                        break;

                    case 3:
                        // asking user to enter withdrawal amount
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();

                        // checking if amount is less than zero or zero
                        if (withdraw <= 0) {
                            System.out.println("Invalid Withdrawal Amount!")

                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using our ATM!");
                        break;
                    
                    default:
                        System.out.println("Invalid Choice!");

                }
                
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