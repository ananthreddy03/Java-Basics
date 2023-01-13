package com.ananth;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=0;i<=n;i++){
            greeting();
        }
    }
    static void  greeting(){
        System.out.println("Hello!!!");
    }
}
