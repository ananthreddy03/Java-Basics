package com.ananth;

import java.util.Scanner;

public class Switchstatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Bright red fruit");
//            case "Kiwi" -> System.out.println("Exotic fruit");
//            default -> System.out.println("Enter a valid input!!!");
//        }

        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
