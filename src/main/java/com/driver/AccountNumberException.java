package com.driver;

public class AccountNumberException extends RuntimeException{
    public AccountNumberException(){
        super("Account Number can not be generated");
    }
}
