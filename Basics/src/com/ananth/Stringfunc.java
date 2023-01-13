package com.ananth;

import java.util.Scanner;

public class Stringfunc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        String message = greet(name);
        System.out.println(message);
    }
     public static String greet(String name){
       String greet = "Hello Mr " + name;
       return greet;
    }
}
