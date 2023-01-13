package com.ananth;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your Age! ");
//        int age = input.nextInt();
//
//        if (age>=18){
//            System.out.println("You are eligible to vote");
//        }
//        else {
//            System.out.println("Sorry you are not eligible to Vote");
//        }

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Age");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Please check the number again, don't enter negative values!!!");
        } else if (age >= 18) {
            System.out.println("You are Eligible to vote");
        } else {
            System.out.println("You are not Eligible to vote");
        }

    }
}
