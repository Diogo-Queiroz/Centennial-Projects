package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {
    public static void main(String[] args) {
        int accountId;
        String name;
        double balance;
        double amount;

        name = JOptionPane.showInputDialog("What's your name?");
        accountId = Integer.parseInt(JOptionPane.showInputDialog("Your Account Number"));
        balance = Double.parseDouble(JOptionPane.showInputDialog("Initial Account Balance"));

        BankAccount bankAccount = new BankAccount(accountId, name, balance);

        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
        amount = Double.parseDouble(JOptionPane.showInputDialog("Make a Deposit of"));
        bankAccount.deposit(amount);

        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
        amount = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to withdraw?"));
        bankAccount.withdraw(amount);

        JOptionPane.showMessageDialog(null, bankAccount.getAccountInfo());
    }
}
