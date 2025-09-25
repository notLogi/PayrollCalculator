package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String myName = myScanner.nextLine();
        System.out.println("Enter your hours worked: ");
        float hoursWorked = myScanner.nextFloat();
        System.out.println("What is your pay rate? ");
        float payRate = myScanner.nextFloat();
        float grossPay = hoursWorked * payRate;
        System.out.println("Employee's name: " + myName);
        System.out.printf("Gross pay: %.2f", grossPay);



    }
}
