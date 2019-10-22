public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(Person p, double ir) {
        super(p);
        interestRate = ir;
    }

    public void addInterest() {
        double added = balance * (interestRate / 100);
        balance = balance + added;
        outputLog("add interest with rate " + interestRate + "%");
    }

    public void withdraw(double amount) {
        if (balance - amount <= 0.0) {
            outputLog("withdraw " + amount);
            System.out.println("!!! Unable to withdraw the amount that will take the balance below 0.0");
            return;
        }

        balance = balance - amount;
        outputLog("withdraw " + amount);
    }

    public String toString() {
        return "Savings account #" + accountNumber + ". Holder: " + person + ". Balance: " + balance;
    }
}