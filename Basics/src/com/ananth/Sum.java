package com.ananth;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers to be added");
        Scanner input = new Scanner(System.in);
        int int1 = input.nextInt();
        int int2 = input.nextInt();

        int sum = int1 + int2;
        System.out.println("The sum of the two numbers is : " + sum);
    }
}
