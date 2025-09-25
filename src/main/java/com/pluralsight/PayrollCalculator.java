package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String myName = myScanner.nextLine();
        System.out.print("Enter your hours worked: ");
        float hoursWorked = myScanner.nextFloat();
        System.out.print("What is your pay rate? ");
        float payRate = myScanner.nextFloat();
        float grossPay = hoursWorked * payRate;
        System.out.println("Employee's name: " + myName);
        System.out.printf("Gross pay: %.2f", grossPay);

        myScanner.close();

    }
}
