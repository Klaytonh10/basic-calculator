package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number(int): ");
        int firstNumber = scanner.nextInt();


        System.out.print("Input second number(int): ");
        int secondNumber = scanner.nextInt();

        System.out.print("+, -, /, or *: ");
        String operator = scanner.next();

        if(operator.equals("+")) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if(operator.equals("-")) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if(operator.equals("/")) {
            if(secondNumber != 0) {
                System.out.println("Result: " + (firstNumber / secondNumber));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else if(operator.equals("*")) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else {
            System.out.println("Error: Invalid operator.");
        }

    }
}
