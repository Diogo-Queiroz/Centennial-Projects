package exercise3;

interface MortgageConstants {
    int shortTerm = 1;
    int midTerm = 3;
    int longTerm = 5;
    String bankName = "BMO";
    double maxAmount = 300000;
}

public abstract class Mortgage implements MortgageConstants{
    protected String mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

    Mortgage (String mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        this.mortgageNumber = mortgageNumber;
        this.term = term;
    }

    public String getMortgageNumber() {
        return mortgageNumber;
    }
    public void setMortgageNumber(String mortgageNumber) {
        this.mortgageNumber = mortgageNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getMortgageAmount() {
        return mortgageAmount;
    }
    public void setMortgageAmount(double mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public int getTerm() {
        return term;
    }
    public void setTerm(int term) {
        if (term != shortTerm && term != midTerm && term != longTerm){
            this.term = shortTerm;
        }
        this.term = term;
    }

    abstract String getMortgageInfo ();
}

class BusinessMortgage extends Mortgage{

    BusinessMortgage (String mortgageNumber, String customerName, double mortgageAmount, int term, double interestRate) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        this.interestRate = interestRate + (0.01 * interestRate);
    }

    @Override
    String getMortgageInfo() {
        return null;
    }
}

class PersonalMortgage extends Mortgage {

    PersonalMortgage (String mortgageNumber, String customerName, double mortgageAmount, int term, double interestRate) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        this.interestRate = interestRate + (0.02 * interestRate);
    }

    @Override
    String getMortgageInfo() {
        return null;
    }
}