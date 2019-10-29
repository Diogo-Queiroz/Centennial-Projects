package exercise3;

import javax.swing.*;;

/**
 * This class is responsible for processing the Mortgage Application
 * We declare variables and options for GUI Application
 */
public class ProcessMortgage {
    public static void main(String[] args) {
        String msg; // Variable responsible for storing messages that will be shown to user
        double interestRate;
        String[] optionsOfTerm = {"1", "3", "5"}; // Options of term One, Three and Five years.
        int typeOfMortgage; // The type of mortgage will be choose based on the index of the Array
        String[] optionsOfMortgages = {"Business", "Personal"}; // Types of mortgages simulations
        Mortgage[] mortgages = new Mortgage[3]; // Array to store the mortgages

        msg = "Please, provider your interest rate";
        interestRate = Double.parseDouble(JOptionPane.showInputDialog(null, msg));
         // Loop that will repeat three times and store on the array all the mortgages simulations
        for (int i = 0; i < mortgages.length; i++) {
            JOptionPane.showMessageDialog(null, "This application will calculate your Mortgage");
            typeOfMortgage = JOptionPane.showOptionDialog(null,
                    "Choose the Mortgage you want to create","Mortgage Application",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsOfMortgages, null);
            setAnswers(interestRate, optionsOfTerm, mortgages, i, typeOfMortgage);
        }
        // Method that will show the mortgages information.
        displayInfos(mortgages);
    }

    private static void displayInfos(Mortgage[] mortgages) {
        // Foreach loop that receives an array and execute the JOptionPane function.
        for (Mortgage mortgage:mortgages) {
            JOptionPane.showMessageDialog(null, mortgage.getMortgageInfo());
        }

    }

    /**
     * This method is responsible for prompting questions and receives the answers from the user
     */
    private static void setAnswers(double interestRate, String[] optionsOfTerm, Mortgage[] mortgages, int i, int typeOfMortgage) {
        String msg;
        String mortgageNumber;
        String customerName;
        double mortgageAmount;
        int term;
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
        if (typeOfMortgage == 0) {
            mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, term, interestRate);
        }
        else {
            mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, term, interestRate);
        }

    }
}
