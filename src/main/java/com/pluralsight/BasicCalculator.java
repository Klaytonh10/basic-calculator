package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number(int): ");
        double firstNumber = scanner.nextInt();


        System.out.print("Input second number(int): ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Possible operations: \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide");
        String operation = scanner.next().toUpperCase();
        System.out.println("You want to " + operation + " the numbers " + firstNumber + " and " + secondNumber);
    }
}
