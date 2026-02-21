// Custom Exception class
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg); // Parent Exception class ko message bhejta hai
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // custom exception manually throw kar rahe hain
            throw new InsufficientBalanceException("Balance kam hai! Withdraw nahi ho sakta bsdk.");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful! Remaining balance: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // ₹1000 balance

        try {
            account.withdraw(1500); // Zyada paisa nikaalne ki koshish
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Transaction process complete.");
    }
}