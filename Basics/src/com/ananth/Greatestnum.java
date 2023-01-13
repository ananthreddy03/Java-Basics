package com.ananth;

import java.util.Scanner;

public class Greatestnum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1: " + " " + "Number 2: " + " " + "Number3: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
//        int max= Math.max(c,(Math.max(a,b))); <---Another method to solve without if conditions
        System.out.println("The greatest number is: " + max);

    }
}
