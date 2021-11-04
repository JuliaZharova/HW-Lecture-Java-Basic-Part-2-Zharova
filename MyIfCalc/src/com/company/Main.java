package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double val1 = 0;
        double val2 = 0;
        String operation;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of the first variable: ");
        try {
            val1 = scanner.nextDouble();
        }
        catch (Exception exception) {
            System.out.println("Please enter a valid number.");
            return;
        }

        System.out.print("Please enter the required operator. Supported operations: +, -, *, /, %: ");
        operation = scanner.next();

        System.out.print("Please enter the value of the second variable: ");
        try {
            val2 = scanner.nextDouble();
        }
        catch (Exception exception) {
            System.out.println("Please enter a valid number.");
            return;
        }

        System.out.print("Result: ");
        if (operation.equals("+")) {
            System.out.println(val1 + val2);
        }
        else if (operation.equals("-")) {
            System.out.println(val1 - val2);
        }
        else if (operation.equals("*")) {
            System.out.println(val1 * val2);
        }
        else if (operation.equals("/")) {
            System.out.println(val1 / val2);
        }
        else if (operation.equals("%")) {
            System.out.println(val1 % val2);
        }
        else {
            System.out.println("Please use only supported operators.");
        }
    }
}
