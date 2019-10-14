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