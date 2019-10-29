package exercise1;

import javax.swing.*;

public class InsuranceDriver {
    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[2];
        String[] options = {"Life", "Health"};
        int clientRequest;
        int qtdInsurances = 0;
        double cost;
        while (qtdInsurances < 2){
            clientRequest = JOptionPane.showOptionDialog(null,
                    "Choose the Insurance you want to add the Monthly cost","Monthly Cost per Insurance",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

            switch (clientRequest) {
                case 0:
                    insurances[qtdInsurances] = new Life();
                    cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount for Life Insurance"));
                    insurances[qtdInsurances].setInsuranceCost(cost);
                    break;
                case 1:
                    insurances[qtdInsurances] = new Health();
                    cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount for Health Insurance"));
                    insurances[qtdInsurances].setInsuranceCost(cost);
                    break;
            }
            qtdInsurances++;
        }
        displayInfos(insurances);
    }

    private static void displayInfos(Insurance[] insurances) {
        for (Insurance insurance:insurances) insurance.displayInfo();
    }
}
