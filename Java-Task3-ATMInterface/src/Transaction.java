
// class that handles transactions

import java.util.ArrayList;

public class Transaction {
    private ArrayList<String> transactions = new ArrayList<>();

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

}
