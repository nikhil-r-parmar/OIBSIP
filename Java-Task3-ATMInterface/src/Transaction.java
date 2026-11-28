
// class that handles transactions

import java.util.ArrayList;

public class Transaction {
    private ArrayList<String> transactions = new ArrayList<>();

    Transaction(String transaction) {
        transactionDetails = transaction;
    }
    
    public String getTransactionDetails() {
        return transactionDetails;
    }
}
