/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex13;
import java.util.Scanner;
import java.math.RoundingMode;

public class Ex13 {

    public static void main(String[] args) {

        double principle, interestRate, years, compound;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principle = scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the rate of interests: ");
        interestRate = scan2.nextDouble();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = scan3.nextDouble();

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter the number of times the interest is compounded per year? ");
        compound = scan4.nextDouble();

        double newInterestRate = interestRate / 100;

        double simpleInterest = principle * (1 + (newInterestRate * years));

        double compoundInterest = principle * (Math.pow((1 + newInterestRate / compound), (compound * years)));

        System.out.print("$" + principle + " invested at %" + interestRate + " for " + years + " years compounded " +
                compound + " times per year is $" + Math.round(compoundInterest * 100.0) / 100.0);

    }

}
