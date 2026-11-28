
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


    // method to check balance
    public void checkBalance(Account account) {
        System.out.println("Current Balance: " + account.getBalance());
    }


    // method to deposit money
    public void depositMoney(Account account, double amount) {
        if(amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Updated Balance: " + account.getBalance());

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

        }

    }
    
}
