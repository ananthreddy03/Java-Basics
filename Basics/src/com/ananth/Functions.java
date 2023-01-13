package com.ananth;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;


        int sum = a + b;
        System.out.println(sum);
    }
}
