package com.ananth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parameters {

    public static void main(String[] args) {
//        final float PI = 3.14f;
//        final Float PI2 = 3.14f;
//
//        Parameters object = new Parameters();
//
//        Double price = 12.232323;
//        final String myName = "Ananth";
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your name: ");
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    public static String myGreet(String name) {
        String message = "Hello " + name + " " + greet();
        return message;
    }

    public static String greet() {
        String greet = "Have a good day!";
        return greet;
    }

    }

