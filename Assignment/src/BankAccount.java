public class BankAccount {
    // Private variables
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Public method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Public getter to check balance
    public double getBalance() {
        return balance;
    }
}

// Using the class
class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        System.out.println("Final balance: $" + account.getBalance());
    }
}
