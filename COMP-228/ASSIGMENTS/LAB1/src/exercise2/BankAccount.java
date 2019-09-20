package exercise2;

class BankAccount {
    private int AccountNumber;
    private String Name;
    private double Balance;

    BankAccount (int accNum, String name, double bal) {
        AccountNumber = accNum;
        Name = name;
        Balance = bal;
    }

    BankAccount () {
        AccountNumber = 0;
        Name = "";
        Balance = 0;
    }

    void withdraw(double Amount) {
        Balance = Balance - Amount;
    }

    void deposit(double Amount) {
        Balance = Balance + Amount;
    }

    String getAccountInfo() {
        return String.format(
                        "|Account Number [%d]   |\n" +
                        "|Owner's Name [%s]     |\n" +
                        "|Account Balance [%.2f]|",
                        getAccountNumber(),
                        getName(),
                        getBalance());
    }

    // Getter and Setter
    private int getAccountNumber() {
        return AccountNumber;
    }
    private String getName() {
        return Name;
    }
    double getBalance() {
        return Balance;
    }
    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
}
