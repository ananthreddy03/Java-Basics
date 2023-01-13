package com.ananth;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        int sum = a+b;
        System.out.println(" The sum of a: " +a+ " and b: " +b +" is: "+sum);

    }
}
