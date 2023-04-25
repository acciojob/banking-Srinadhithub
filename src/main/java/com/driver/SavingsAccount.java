package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name,balance,0);
 this.maxWithdrawalLimit=maxWithdrawalLimit;
 this.rate=rate;
    }
    public void withdraw(double amount) {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        try {
            if(amount>maxWithdrawalLimit) throw new MaximumWithDrawLimitException();
            if (amount - getBalance() < getMinBalance()) throw new InsufficientBalanceException();
           setBalance(amount-getBalance());
        }
        catch (InsufficientBalanceException ex){
            System.out.println("Insuufficient Balance");
        }

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
          double p=getBalance();
          return p+(p*years*rate)/100;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
 double A=0;
 double p=getBalance();
  double pow=Math.pow((times+rate)/times,times*years);
  return p*pow;
    }

}
