package exercise3;

import javax.swing.*;

public abstract class Mortgage implements MortgageConstants{
    private final String mortgageNumber;
    private final String customerName;
    private double mortgageAmount;
    double interestRate;
    private int term;

    Mortgage (String mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.customerName = customerName;
        setMortgageAmount(mortgageAmount);
        this.mortgageNumber = mortgageNumber;
        setTerm(term);
    }

    public void setMortgageAmount(double mortgageAmount) {
        if (mortgageAmount > maxAmount) {
            String msg = String.format("Unfortunately your amount requested of %.0f is bigger than the max amount available of %.0f, in this case your mortgage will be %.0f,",
                    mortgageAmount, maxAmount, maxAmount);
            JOptionPane.showMessageDialog(null, msg);
            this.mortgageAmount = maxAmount;
        }
        else {
            this.mortgageAmount = mortgageAmount;
        }
    }
    public void setTerm(int term) {
        switch (term) {
            case 0:
                this.term = shortTerm;
                break;
            case 1:
                this.term = midTerm;
                break;
            case 2:
                this.term = longTerm;
                break;
        }
    }

    public String getMortgageNumber() { return mortgageNumber; }
    public String getCustomerName() {
        return customerName;
    }
    public double getMortgageAmount() {
        return mortgageAmount;
    }
    public double getInterestRate() { return interestRate; }
    public int getTerm() {
        return term;
    }
    public String getBankName() { return bankName; }
    abstract String getMortgageInfo ();
    abstract double getTotalOwned();
}