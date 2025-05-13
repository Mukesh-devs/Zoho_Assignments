class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | Current Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Current Balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}


class Q4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 500.0);

        account.deposit(200.0);

        try {
            account.withdraw(100.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }


        try {
            account.withdraw(700.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-50.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
