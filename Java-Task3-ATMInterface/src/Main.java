
// Java Development Intern Task - 3
// ATM Interface
// Author : Nikhil R. Parmar

// imported scanner class
import java.util.Scanner;

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
            System.out.println("Updated Balance: " + balance);

        } else {
            System.out.println("Invalid Deposit Amount!");

        }

        return balance;
    }

    // nethod that withdraw's money form balance
    public static double withdrawMoney(double balance, double amount) {
        // checking if amount is less than zero or zero
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");

        } else if (balance < amount) {
            // checks if withdrawal amount exceeds the balance
            System.out.println("Insufficient Balance!");

        } else {
                            // updating and printing balance
            balance -= amount;
            System.out.println("\nWithdrawal Successful!");
            System.out.println("Updated Balance: " + balance);

        }

        return balance;
    }

    public static void main(String[] args) {
        // creating object of scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        //creating ATM class Object
        ATM atm = new ATM();
        Account acc = atm.geAccount();

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

        Account loggedAccount = atm.login(uid, pin);

        // checking if user id and pin matches or not
        if (loggedAccount != null) {
                // prints success if both matches
                System.out.println("Login Successful!");
                System.out.println("Welcome to " + loggedAccount.getUserId());
                loggedIn = true; 

                int choice;
                // repeating ATM menu until user selects exit 
                do {
                // printing atm operations after successful logic
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transaction History");
                System.out.println("5. Transfer Money");
                System.out.println("6. Exit");

                // taking user's choice as integer
                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                // using switch case to perform each operations
                switch (choice) {
                    case 1:
                        atm.checkBalance(loggedAccount);
                        break;

                    case 2:
                        // asking user to enter deposit amount
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        atm.depositMoney(loggedAccount, deposit);
                        break;

                    case 3:
                        // asking user to enter withdrawal amount
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();

                        atm.withdrawMoney(loggedAccount, withdraw);
                        break;

                    case 4:
                        atm.showTransactionHistory(loggedAccount);
                        break;

                    case 5:
                        System.out.print("Enter Receiver User ID: ");
                        String receiverId = sc.next();

                        // checks receiver id exists or not
                        if (receiverId.equals(receiver.getUserId())) {
                            System.out.println("Receiver Accoun Found!");

                            // taking transfer amount input
                            System.out.print("Enter transfer amount: ");
                            double amount = sc.nextDouble();

                            // checking transfer amount is valid or not
                            if (amount <= 0) {
                                System.out.println("Invalid Transfer Amount!");

                            } else if (acc.getBalance() < amount) {
                                System.out.println("Insufficient Balance!");

                            } else {
                                System.out.println("Transfer Validated Successfully!");

                                acc.setBalance(acc.getBalance() - amount);
                                receiver.setBalance( receiver.getBalance()+ amount);

                                System.out.println("\nTransfer Successful!");
                                System.out.println("Transferred Amount: Rs. " + amount);
                                System.out.println("Your Updated Balance: Rs. " + acc.getBalance());
                                System.out.println("Receiver Updated Balance: Rs. " + receiver.getBalance());

                                acc.addTransaction("Transferred: Rs. " + amount + " to " + receiver.getUserId());

                                receiver.addTransaction("Received: Rs. " + amount + " from " + acc.getUserId());

                            }


                        } else {
                            System.out.println("Invalid Receiver User ID!");
                        }
                        break;

                    case 6:
                        System.out.println("Thank you for using our ATM!");
                        break;
                    
                    default:
                        System.out.println("Invalid Choice!");

                }
                
                // runs loop again till the choice is not 6
                } while (choice != 6);
            
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