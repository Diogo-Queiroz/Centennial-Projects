package exercise2;

import javax.swing.*;

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

    public void withdran(double Amount) {
        if (Balance - Amount < 0) {
            JOptionPane.showMessageDialog(null, "I'm sorry, but you don't have enough money to process this request");
        } else if (Balance > 0) {
            Balance = Balance - Amount;
        }
        else {
            JOptionPane.showMessageDialog(null, "First make a deposit, thank you");
        }
    }

    public void deposit(double Amount) {
        Balance = Balance + Amount;
    }

    public void getAccountInfo() {
        JOptionPane.showMessageDialog(null,
                String.format(
                        "Account Number [%d], Owner's Name [%s], Account Balance [%.2f]",
                        getAccountNumber(),
                        getName(),
                        getBalance()));
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
