package exercise3;

import javax.swing.*;

public class ProcessMortgage {
    public static void main(String[] args) {
        String msg;
        String mortgageNumber;
        String customerName;
        double mortgageAmount;
        double interestRate;
        int term;
        String[] optionsOfTerm = {"1", "3", "5"};
        int typeOfMortgage; // The type of mortgage will be choose based on the index of the Array
        String[] optionsOfMortgages = {"Business", "Personal"};
        Mortgage[] mortgages = new Mortgage[3];

        msg = 
        interestRate = Double.parseDouble(JOptionPane.showInputDialog(null, msg));
        for (int i = 0; i < mortgages.length; i++) {
            JOptionPane.showMessageDialog(null, "This application will calculate your Mortgage");
            typeOfMortgage = JOptionPane.showOptionDialog(null,
                    "Choose the Insurance you want to add the Monthly cost","Monthly Cost per Insurance",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsOfMortgages, null);
            if (typeOfMortgage == 0) {
                msg = "Provide the Mortgage Number";
                mortgageNumber = JOptionPane.showInputDialog(null, msg);
                msg = "Please, provide your customer Name";
                customerName = JOptionPane.showInputDialog(null, msg);
                msg = "Please, inform the amount of Mortgage";
                mortgageAmount = Double.parseDouble(JOptionPane.showInputDialog(null, msg));
                msg = "Please, select the term of your Mortgage";
                term = JOptionPane.showOptionDialog(null,
                        msg,"Options of Terms",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsOfTerm, null);
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, term);
            }
        }
    }
}
