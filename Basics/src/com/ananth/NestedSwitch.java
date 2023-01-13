package com.ananth;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1:
                System.out.println("Ananth");
                break;

            case 2:
                System.out.println("Bharath");
                break;

            case 3:
                System.out.println("John");
                 switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("Data not found");
                }
                break;
            default:
                System.out.println("Please enter correct empID");
        }
    }
}
