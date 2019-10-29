package exercise1;

import javax.swing.*;

class Health extends Insurance {

    // Constructor
    Health () { super("Health Insurance"); }

    // Override Methods
    @Override
    void setInsuranceCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    @Override
    void displayInfo() {
        String msg = String.format("Insurance Type: %s, monthly cost of %.2f", getTypeInsurance(), getMonthlyCost());
        JOptionPane.showMessageDialog(null, msg);
    }
}
