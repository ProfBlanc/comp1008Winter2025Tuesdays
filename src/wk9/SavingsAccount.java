package wk9;

public class SavingsAccount extends CheckingAccount {

    private final double minAmount;
    private double interestRate;

    public SavingsAccount(){
        super(0);
        minAmount = 100;
    }
    public SavingsAccount(double minAmount, double balance) {
        super(balance);
        this.minAmount = minAmount;
        setInterestRate();
    }
    @Override
    public String withdraw(double amount) {
        if(getNumberOfTransactions() == 1)
            throw new IllegalArgumentException("Only 1 transaction allowed!");

        return super.withdraw(amount);
    }
    private void setInterestRate() {
        interestRate = minAmount / 100.0;
    }
    public double getInterestAmount(){
        return getBalanceAmount() * interestRate;
    }

}
