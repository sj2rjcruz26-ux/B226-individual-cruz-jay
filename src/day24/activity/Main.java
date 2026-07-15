package day24.activity;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings
                = new SavingsAccount("SA001", "Ronald Jay Cruz", 5000, 2.5);

        CheckingAccount checking
                = new CheckingAccount("CA001", "Romel Cabiling", 3000, 1000);

        savings.displayAccountInfo();
        savings.deposit(1000);
        savings.withdraw(2000);

        checking.displayAccountInfo();
        checking.deposit(500);
        checking.withdraw(4000);
    }
}
