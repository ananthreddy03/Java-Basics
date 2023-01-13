package com.ananth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Reverse {
    public static void main(String[] args) {

        int n = 345672;
        int ans = reverseNumber(n);

        System.out.println(ans);

    }

    public static int reverseNumber(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
        return ans;
    }

}
