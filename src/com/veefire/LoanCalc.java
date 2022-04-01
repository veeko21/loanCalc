package com.veefire;

import java.util.Scanner;

public class LoanCalc {

    private static final double debt = -1;
    static Scanner scanner = new Scanner(System.in);
    static int creditModifier;
    static int constraint;
    static Long personalCode;
    static int loanAmount;
    static int loanPeriod;

    public static void main(String[] args) {

        //user input

            System.out.println("This is a loan calculator!");

            if(constraint >= 2000 && constraint < 10000) {
                System.out.println("Enter your personal code:");
                personalCode = scanner.nextLong();

                System.out.println("Enter you loan amount:");
                loanAmount = scanner.nextInt();

                System.out.println("Enter loan period in months:");
                loanPeriod = scanner.nextInt();
            }

        //how creditModifier is connected to user input?

        if(creditModifier >= 100 && creditModifier < 300) {
            System.out.println("Your identifier is: 49002010976");
        } else if (creditModifier >= 300 && creditModifier < 1000) {
            System.out.println("Your identifier is: 49002010987");
        } else {
            System.out.println("Your identifier is: 49002010998");
        }

        int creditScore = (creditModifier/loanAmount) / loanPeriod;

        if(creditScore <= debt) {
            System.out.println("Sorry, you have debt! We cannot approve any amount!");
        } else {
            System.out.println("Congrats! Your maximum approved amount is " + maxApprovedAmount);
        }
    }
}
