package day24.activity;

class SavingsAccount extends Account implements Transaction {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("\n=== SAVINGS ACCOUNT ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdraw: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
