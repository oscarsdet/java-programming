package day46;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type = "checking";// default is checking, we can change if needed using setter

    /**
     * public void setAccountInfo(long account, String accountHolder , double balance , String
     * type)
     * 1) this.accountNumber = accountNumber;
     * 2) setAccountNumber (accountNumber);
     * @return
     */
    //right click  generate getter and setter select all


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
