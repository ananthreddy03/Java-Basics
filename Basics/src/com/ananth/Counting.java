package com.ananth;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        int n = 4565556;
        int count = 0;

        int digit = 5;
        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }


    public static class Sum {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            for (int i = 0; i <= n; i++) {
                int sum = sum();
                System.out.println("The sum = " + sum);
            }

        }

        public static int sum() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int a = input.nextInt();
            System.out.println("Enter num2: ");
            int b = input.nextInt();
            int sum = a + b;
    //        System.out.println("The sum= " + sum);
            return sum;
        }
    }
}
