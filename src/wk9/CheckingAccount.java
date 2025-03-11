package wk9;

public class CheckingAccount {

    private double balance;
    private final int MAX_TRANSACTIONS = 10;
    private int numberOfTransactions;

    public CheckingAccount(double balance) {
        setBalance(balance);
    }
    private void setBalance(double balance) {
        this.balance = Math.max(0, balance);
    }
    public String getBalance() {
        return String.format("Your balance is now: $%.2f.", balance);
    }
    public String withdraw(double amount) {
        if(numberOfTransactions > MAX_TRANSACTIONS ){
            throw new IllegalArgumentException("You've reached your max amount of transactions");
        }
        numberOfTransactions++;
        if(amount <= balance){
            setBalance(balance - amount);
        }
        return String.format("You withdrew $%.2f. %s",
                amount, getBalance());
    }
    public String deposit(double amount) {
        setBalance(balance + amount);

        return String.format("You deposited $%.2f. %s", amount, getBalance());
    }
}
