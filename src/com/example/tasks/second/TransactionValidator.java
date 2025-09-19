package com.example.tasks.second;

public class TransactionValidator {
    public static final Integer MIN_AMOUNT = 1;
    public static final Integer MAX_AMOUNT = 5000;

    public static boolean isValidAmount(Double amount){
        if (amount > 1 && amount < 5000) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return true;
        }
        else{
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
    }
}
