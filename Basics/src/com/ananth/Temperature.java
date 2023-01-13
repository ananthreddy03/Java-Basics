package com.ananth;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Temp in Celsius:  ");
        float celsius = input.nextFloat();
        float fahrenheit = (float) (celsius * 1.8) + 32;
        System.out.println(fahrenheit);
    }
}
