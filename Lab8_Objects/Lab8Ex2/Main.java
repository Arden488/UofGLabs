public class Main {
    public static void main(String[] args) {
        Person p1 = new Lecturer("Anton", "Samoilov", 31, 100000);
        Person p2 = new Student("Nikolay", "Samoilov", 37, 3.8);
        SavingsAccount bankAcc1 = new SavingsAccount(p1, 10);
        SavingsAccount bankAcc2 = new SavingsAccount(p2, 300);
        SavingsAccount bankAcc3 = new SavingsAccount(p2, 50);

        bankAcc1.deposit(10);
        // bankAcc1.addInterest();
        bankAcc2.deposit(15.0);
        bankAcc2.withdraw(13.5);
        bankAcc2.withdraw(3.5);
        bankAcc2.addInterest();
        bankAcc2.withdraw(3.5);
        bankAcc1.transfer(1.2, bankAcc3);

        // System.out.println(bankAcc1);
        // System.out.println(bankAcc2);
        // System.out.println(bankAcc3);
    }
}