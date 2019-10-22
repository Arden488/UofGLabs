public class BankAccount {
    protected Person person;
    protected int accountNumber;
    protected double balance;
    protected static int nextAccountNumber = 0;

    public BankAccount(Person p) {
        person = p;
        accountNumber = nextAccountNumber++;
        balance = 0.0;
    }

    protected void outputLog(String operation) {
        System.out.println("\n>>> Operation: " + operation);
        System.out.println(this.toString());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        outputLog("deposit " + amount);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        outputLog("withdraw " + amount);
    }

    public void transfer(double amount, BankAccount targetAccount) {
        BankAccount currentBankAcc = this;
        currentBankAcc.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public String toString() {
        return "Bank account #" + accountNumber + ". Holder: " + person + ". Balance: " + balance;
    }
}