package exercise2;

import javax.swing.JOptionPane;

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

    public void withdraw(double Amount) {
        if (Amount > Balance) {
            JOptionPane.showMessageDialog(null, "I'm sorry, but you don't have enough money to process this request");
        } else {
            Balance = Balance - Amount;
        }
    }

    public void deposit(double Amount) {
        Balance = Balance + Amount;
    }

    public String getAccountInfo() {
        String message = String.format(
                        "|Account Number [%d]   |\n" +
                        "|Owner's Name [%s]     |\n" +
                        "|Account Balance [%.2f]|",
                        getAccountNumber(),
                        getName(),
                        getBalance());
        return message;
    }

    // Getter and Setter
    public int getAccountNumber() {
        return AccountNumber;
    }
    public String getName() {
        return Name;
    }
    public double getBalance() {
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
