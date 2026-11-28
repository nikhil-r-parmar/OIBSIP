
// class that handles bank account details

public class Bank {
    private Account acc1 = new Account("NIKHIL101", 1234, 5000.0);
    private Account acc2 = new Account("NIKHIL102", 5678, 3000.0);

    // method to find account
    public Account findAccount(String userId) {
        if (userId.equals(acc1.getUserId())) {
            return acc1;
        } else if (userId.equals(acc2.getUserId())) {
            return acc2;
        } else {
            return null;
        }
    }
    
}
