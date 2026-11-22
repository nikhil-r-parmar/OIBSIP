
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

    // method that check's balance 
    public static void checkBalance(double balance) {
        System.out.println("Balance: " + balance);

    }

    // method that deposit's money
    public static double depositMoney(double balance, double amount) {
        //checking whether amount is more than zero or not.
                        if (amount > 0) {
                            // updating and returning balance
                            balance += amount;
                            System.out.println("\nDeposit Successful!");

                        } else {
                            System.out.println("Invalid Deposit Amount!");

                        }

                        return balance;
    }

    public static void main(String[] args) {
        // creating object of scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        // created object of account class
        Account acc = new Account();

        // initialized account class variables
        acc.userId = "NIKHIL101";
        acc.pin = 1234;
        acc.balance = 5000.0;

        // counter that count's attemps;
        int counter = 0;
        // boolean varibale tell's account loggedin or not
        boolean loggedIn = false;

        do {
        // taking inputs from user
        System.out.println("===== ATM LOGIN =====");
        System.out.print("Enter User ID: ");
        String uid = sc.nextLine();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        sc.nextLine();  // another attempt for id

        // updates counter for each time;
        counter++;

        // checking if user id and pin matches or not
        if (uid.equals(acc.userId) && pin == acc.pin) {
                // prints success if both matches
                System.out.println("Login Successful!");
                System.out.println("Welcome to " + acc.userId);
                loggedIn = true; 

                int choice;
                // repeating ATM menu until user selects exit 
                do {
                // printing atm operations after successful logic
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                // taking user's choice as integer
                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                // using switch case to perform each operations
                switch (choice) {
                    case 1:
                        checkBalance(acc.balance);
                        break;

                    case 2:
                        // asking user to enter deposit amount
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        acc.balance = depositMoney(acc.balance, deposit);
                        System.out.println("Updated Balance: " + acc.balance);
                        break;

                    case 3:
                        // asking user to enter withdrawal amount
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();

                        // checking if amount is less than zero or zero
                        if (withdraw <= 0) {
                            System.out.println("Invalid Withdrawal Amount!");

                        } else if (acc.balance < withdraw) {
                            // checks if withdrawal amount exceeds the balance
                            System.out.println("Insufficient Balance!");

                        } else {
                            // updating and printing balance
                            acc.balance -= withdraw;
                            System.out.println("\nWithdrawal Successful!");
                            System.out.println("Updated Balance: " + acc.balance);

                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using our ATM!");
                        break;
                    
                    default:
                        System.out.println("Invalid Choice!");

                }
                
                // runs loop again till the choice is not 4
                } while (choice != 4);
            
        } else {
            // prints it if uid & pin doesn't match
            System.out.println("Invalid User ID or Pin.");

        }

        // outside after 3 attempts
        } while(counter < 3 && !loggedIn);

        // locks account if not logged in in 3 attempts 
        if(!loggedIn) {
            System.out.println("Account locked!");
            System.out.println("Too many failed login attempts.");
        }

    }
}