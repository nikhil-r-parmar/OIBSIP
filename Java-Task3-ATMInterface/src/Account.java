
// class that manages accounts

public class Account {
    private Transaction transaction = new Transaction();
    
    //method to add transaction
    public void addTransaction(String transaction) {
        this.transaction.addTransaction(transaction);
    }

    public void showTransactions() {
        transaction.showTransactions();
    }

    // private instance variables
    private String userId;
    private int pin;
    private double balance;

    // getters which makes all three instance varibale accessible
    public String getUserId() {
        return this.userId;
    }

    public int getPin() {
        return this.pin;
    }

    public double getBalance() {
        return this.balance;
    }


    // setter that set's balance
    public void setBalance(double balance) {
        if(balance>=0){
            this.balance = balance;
        }
    }

    // parameterized constructor that initiallizes class variables
    public Account(String uId, int p, double b) {
        userId = uId;
        pin = p;
        balance = b;

    }

}