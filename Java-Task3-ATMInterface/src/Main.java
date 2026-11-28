
// Java Development Intern Task - 3
// ATM Interface
// Author : Nikhil R. Parmar

// imported scanner class
import java.util.Scanner;

// main class
public class Main {

    public static void main(String[] args) {
        // creating object of scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        //creating ATM class Object
        ATM atm = new ATM();

        // counter that count's attemps;
        int counter = 0;
        // boolean varibale tell's account loggedin or not
        boolean loggedIn = false;

        do {
            // taking inputs from user
            System.out.println("\n================================");
            System.out.println("          NIKHIL BANK");
            System.out.println("          ATM INTERFACE");
            System.out.println("================================");
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
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome, " + loggedAccount.getUserId() + "!");
                System.out.println("--------------------------------");
                loggedIn = true; 

                int choice;
                // repeating ATM menu until user selects exit 
                do {
                    // printing atm operations after successful logic
                    System.out.println("\n----------- ATM MENU -----------");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Transaction History");
                    System.out.println("5. Transfer Money");
                    System.out.println("6. Exit");
                    System.out.println("--------------------------------");

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

                        Account receiver = atm.findAccount(receiverId);

                        // checking if receiver is null or not
                        if(receiver == null) {
                            System.out.println("Receiver account not found!");
                        } else {
                            System.out.print("Enter amount to transfer: ");
                            double amount = sc.nextDouble();
                            sc.nextLine();

                            atm.transferMoney(loggedAccount, receiver, amount);

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


        sc.close();

    }
}