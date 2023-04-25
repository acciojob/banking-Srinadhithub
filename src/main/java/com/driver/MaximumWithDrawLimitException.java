package com.driver;

public class MaximumWithDrawLimitException extends RuntimeException{
    public MaximumWithDrawLimitException(){
        super("Maximum Withdraw Limit Exceed");
    }
}
