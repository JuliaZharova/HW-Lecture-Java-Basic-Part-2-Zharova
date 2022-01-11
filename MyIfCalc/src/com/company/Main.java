package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double val1 = 0;
        double val2 = 0;
        String operation;
        String supportOperations = " + - * / %";
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;

        do {
            System.out.println("Please enter the value of the first variable: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            } else {
                val1 = scanner.nextDouble();
                cycle = false;
            }

        } while (cycle);

        cycle = true;

        do {
            System.out.println("Please enter the required operator. Supported operations: +, -, *, /, %: ");
            operation = scanner.next();
            if (!supportOperations.contains(operation)) {
                System.out.println("Please use only supported operators. ");
            } else {
                //operation = scanner.next();
                cycle = false;
            }

        } while (cycle);

        cycle = true;

        do {
            System.out.println("Please enter the value of the second variable: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            } else {
                val2 = scanner.nextDouble();
                cycle = false;
            }

        } while (cycle);

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
