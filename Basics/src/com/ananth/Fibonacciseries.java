package com.ananth;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci number is: " + b);

    }

}
