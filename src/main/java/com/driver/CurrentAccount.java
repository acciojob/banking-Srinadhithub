package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void setTradeLicenseId(String tradeLicenseId) {
        this.tradeLicenseId = tradeLicenseId;
    }

    public CurrentAccount(String name, double balance, String tradeLicenseId) {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exceptio
        super(name,balance,5000);
        try {
            if (balance < 5000) throw new InsufficientBalanceException();
        }
        catch(InsufficientBalanceException ex){
            System.out.println(ex);
        }

    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

    }

}
