package day24.activity;

class CheckingAccount extends Account implements Transaction {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
            double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("\n=== CHECKING ACCOUNT ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("\nWithdraw: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
