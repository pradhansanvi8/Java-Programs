interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

class Account extends Customer implements Bank {
    double balance = 0;

    Account(String name) {
        super(name);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Account a = new Account("Sanvi");

        a.deposit(1000);
        a.withdraw(300);
        a.display();
    }
}