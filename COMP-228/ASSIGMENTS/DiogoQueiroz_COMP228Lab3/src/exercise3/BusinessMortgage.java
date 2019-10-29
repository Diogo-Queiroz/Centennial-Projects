package exercise3;

class BusinessMortgage extends Mortgage{

    BusinessMortgage (String mortgageNumber, String customerName, double mortgageAmount, int term, double interestRate) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        this.interestRate = interestRate + (0.01 * interestRate);
    }

    @Override
    String getMortgageInfo() {
        return String.format("Business Mortgage Info:\n" +
                        "Mortgage Number: %s\n" +
                        "Mortgage Customer Name: %s\n" +
                        "Mortgage Amount: $%.2f\n" +
                        "Mortgage Interest Rate: %.2f%%\n" +
                        "Mortgage Term Size: %d years\n" +
                        "Total Amount for Term: %.2f\n" +
                        "Provide by: %s.",
                getMortgageNumber(), getCustomerName(),
                getMortgageAmount(), getInterestRate(),
                getTerm(), getTotalOwned(), getBankName());
    }

    @Override
    double getTotalOwned() {
        double mortgageAmount = getMortgageAmount();
        double interestRatePerCent = getInterestRate() / 100;
        double term = getTerm();
        return (mortgageAmount + (mortgageAmount * interestRatePerCent) * term);
    }
}