
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
        account.getBalance();
    }
    
}
