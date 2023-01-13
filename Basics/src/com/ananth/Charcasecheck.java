package com.ananth;

import java.util.Scanner;

public class Charcasecheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "-" + "lower case");
        } else {
            System.out.println(ch + "-" + "UPPER CASE");
        }
    }
}
