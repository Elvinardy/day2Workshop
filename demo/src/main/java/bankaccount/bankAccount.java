package bankaccount;

import java.util.List;

public class bankAccount {
    private String name;
    private String accountNumber;
    private static float accountBalance;
    private List<String> transactions;
    private boolean isClosed;
    private String accountCreateDate;
    private String accountClosedDate;


    public bankAccount() {

        this("user", "12345", 0);
    }

    public bankAccount(String name, float accountBalance) {
        
        this(name, accountBalance);

    }

    public bankAccount (String name, String accountNumber, float accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

        System.out.println("This is John's account");
    }


    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return float return the accountBalance
     */
    public float getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @return List<String> return the transactions
     */
    public List<String> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return boolean return the isClosed
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * @param isClosed the isClosed to set
     */
    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    /**
     * @return String return the accountCreateDate
     */
    public String getAccountCreateDate() {
        return accountCreateDate;
    }

    /**
     * @param accountCreateDate the accountCreateDate to set
     */
    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    /**
     * @return String return the accountClosedDate
     */
    public String getAccountClosedDate() {
        return accountClosedDate;
    }

    /**
     * @param accountClosedDate the accountClosedDate to set
     */
    public void setAccountClosedDate(String accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    public void deposit(double depositAmount, String date, String time) throws IllegalAccessException {
        
       if(depositAmount < 0){
           throw new IllegalAccessException("Nothing is deposited");
       }
       else {
       System.out.println("Deposit " + depositAmount + " at " + date + " at" + time);
       }
    }
    public void withdrawal(double withdrawalAmount, String date, String time) throws IllegalAccessException {
        if(accountBalance - withdrawalAmount < 0) {
            throw new IllegalAccessException("insufficient funds");
        }
        else  {
            System.out.println("Withdrawal " + withdrawalAmount + " at " + date + " at " + time);
        }

    }

}
