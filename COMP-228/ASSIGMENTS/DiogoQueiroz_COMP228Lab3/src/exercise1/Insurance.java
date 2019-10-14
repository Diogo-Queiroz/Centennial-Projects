package exercise1;

import javax.swing.*;

abstract class Insurance {
    protected String typeInsurance;
    protected double monthlyCost;

    Insurance (String typeInsurance) {
        this.typeInsurance = typeInsurance;
    }

    public String getTypeInsurance() { return typeInsurance; }
    public double getMonthlyCost() { return monthlyCost; }

    abstract void setInsuranceCost(double monthlyCost);
    abstract void displayInfo();
}

class Health extends Insurance {

    Health () { super("Health Insurance"); }

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

class Life extends Insurance {

    Life () { super("Life Insurance"); }

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
