package com.ananth;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name :: ");
        String name = scanner.next();
        System.out.println("Name is :: " + name);
    }
}
