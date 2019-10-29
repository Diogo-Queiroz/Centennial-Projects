package exercise1;

abstract class Insurance {
    // Attributes
    private final String typeInsurance;
    double monthlyCost;

    // Constructor
    Insurance (String typeInsurance) {
        this.typeInsurance = typeInsurance;
    }

    // Class Methods
    String getTypeInsurance() { return typeInsurance; }
    double getMonthlyCost() { return monthlyCost; }

    // Abstract Methods that need to be implemented
    abstract void setInsuranceCost(double monthlyCost);
    abstract void displayInfo();
}

