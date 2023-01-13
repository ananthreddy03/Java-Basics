package com.ananth;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter num1: ");
                int num1 = input.nextInt();
                System.out.println("Enter num2: ");
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Input!!!");
            }
            System.out.println("The answer is: " + ans);
        }
    }
}
