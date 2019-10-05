package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {
    public static void main(String[] args) {
        int accountId;
        String name;
        double balance;
        double amount;
        // Get information to instantiate the bank account.
        name = JOptionPane.showInputDialog("What's your name?");
        accountId = Integer.parseInt(JOptionPane.showInputDialog("Your Account Number"));
        balance = Double.parseDouble(JOptionPane.showInputDialog("Initial Account Balance"));
        // Instantiate the bank account
        BankAccount bankAccount = new BankAccount(accountId, name, balance);
        // Get account info and perform a deposit
        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
        amount = Double.parseDouble(JOptionPane.showInputDialog("Make a Deposit of"));
        if (amount <= 0) {
            JOptionPane.showMessageDialog(null, "Please, provide an amount more than 0");
        } else {
            bankAccount.deposit(amount);
            JOptionPane.showMessageDialog(null, "Thank you for the deposit of " + amount);
        }
        // Get account info and perform a withdraw
        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
        amount = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to withdraw?"));
        if (amount > bankAccount.getBalance()) {
            JOptionPane.showMessageDialog(null, "I'm sorry, but you don't have enough money.");
        } else {
            bankAccount.withdraw(amount);
            JOptionPane.showMessageDialog(null, "Withdraw completed.");
        }
        // Get account info
        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
    }
}
