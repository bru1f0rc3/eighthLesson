package com.example.tasks.second;

import java.util.Scanner;

public class secondTask {
    public static void outPut(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        Double amount = scanner.nextDouble();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
    }
}
