package com.example.tasks.second;

public class TransactionValidator {
    public static final Integer MIN_AMOUNT = 1;
    public static final Integer MAX_AMOUNT = 5000;

    public static boolean isValidAmount(Double amount){
        return amount > MIN_AMOUNT && amount < MAX_AMOUNT;
    }
}
