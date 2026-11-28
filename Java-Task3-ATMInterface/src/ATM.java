
// class that handles ATM operations

public class ATM {
    private Bank bank = new Bank();

    // login method
    public Account login(String userId, int pin) {

        Account acc = bank.findAccount(userId);
        if(acc == null) {
            return null;

        } else if (acc.getPin() == pin) {
            return acc;

        } else {
            return null;
        }
    }
    
    // find account method
    public Account findAccount(String userId) {
        return bank.findAccount(userId);
    }


    // method to check balance
    public void checkBalance(Account account) {
        System.out.println("Current Balance: " + account.getBalance());
    }


    // method to deposit money
    public void depositMoney(Account account, double amount) {
        if(amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Updated Balance: " + account.getBalance());
            System.out.println("Money Deposited Successfully!");

            account.addTransaction("Deposited: Rs. " + amount);

        } else {
            System.out.println("Invalid Amount!");

        }
    }


    // method to withdraw money
    public void withdrawMoney(Account account, double amount) {
        if(amount <= 0) {
            System.out.println("Invalid amount entered!");

        } else if(account.getBalance() < amount) {
            System.out.println("Insufficient balance!");

        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Updated Balance: " + account.getBalance());
            System.out.println("Money Withdrawn Successfully!");

            account.addTransaction("Withdrawn: Rs. " + amount);

        }

    }


    // method to transfer money
    public void transferMoney(Account sender, Account receiver, double amount) {
        if(amount <= 0) {
            System.out.println("Invalid amount entered!");

        } else if(sender.getBalance() < amount) {
            System.out.println("Insufficient balance!");

        } else if(sender == receiver) {
            System.out.println("Cannot transfer money to the same account!");

        } else {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("Money Transferred Successfully!");
            System.out.println("Updated Balance: " + sender.getBalance());

            sender.addTransaction("Transferred: Rs. " + amount + " to " + receiver.getUserId());

            receiver.addTransaction("Received: Rs. " + amount + " from " + sender.getUserId());

        }

    }

    // method to show transaction history
    public void showTransactionHistory(Account account) {
        account.showTransactions();

    }
    
}
