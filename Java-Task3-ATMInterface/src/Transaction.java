
// class that handles transactions

import java.util.ArrayList;

public class Transaction {
    private ArrayList<String> transactions = new ArrayList<>();

    // transactions adder
    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    // method to show transaction history
    public void showTransactions() {
        
        // logic to show transactions history
        System.out.println("\n===== TRANSACTION HISTORY =====");

        if(transactions.isEmpty()) {
            System.out.println("No transactions found!");

        } else {
            for (String transaction : transactions.) {
                System.out.println(transaction);
            }

        }

    }

}
