package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        float gross;

        System.out.print("How many hours did you work this week? ");
        float hours = myScanner.nextFloat();

        System.out.print("What is your hourly? ");
        myScanner.nextLine();
        float rate = myScanner.nextFloat();


        System.out.println("Employee Name: " + name);

        if (hours > 40) {
            rate = rate + 1.5f;
            gross = hours * rate;
        } else {
            gross = hours * rate;
        }

        System.out.println("Gross Pay: $" + String.format("%.2f", gross));


    }

}
