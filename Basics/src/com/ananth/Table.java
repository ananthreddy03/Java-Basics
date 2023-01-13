package com.ananth;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Enter another number: ");
        int m = input.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}

