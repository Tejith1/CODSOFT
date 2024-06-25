import java.util.*;

class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(150000.00);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        while (true) {
            System.out.println("Select any one of the options:");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw some Amount");
            System.out.println("3. Check balance Amount");
            System.out.println("4. Exit");
            System.out.print("Your Option: ");
            int c = sc.nextInt();

            if (c == 1) {
                System.out.print("Enter the amount you want to deposit: ");
                double amt = sc.nextDouble();
                account.deposit(amt);
                System.out.println("Current Amount: " + account.getBalance());
            } else if (c == 2) {
                System.out.print("Enter the amount you want to withdraw: ");
                double amt = sc.nextDouble();
                if (account.withdraw(amt)) {
                    System.out.println("Current Amount: " + account.getBalance());
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (c == 3) {
                System.out.println("Balance: " + account.getBalance());
            } else {
                System.out.println("Thanks for visiting, Come again");
                break;
            }
        }
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
