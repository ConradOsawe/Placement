import java.util.Scanner;

// ATM class to handle withdrawal
class ATM {
    private double balance;

    // constructor
    public ATM(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create ATM object with initial balance
        ATM atm = new ATM(5000);

        System.out.println("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        atm.withdraw(amount);
        sc.close();
    }
}