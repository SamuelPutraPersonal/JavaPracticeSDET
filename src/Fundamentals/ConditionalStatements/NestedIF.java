package Fundamentals.ConditionalStatements;

import java.util.Scanner;

public class NestedIF {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        double income;
        int credit;

        System.out.println("Enter your salary: ");
        income = scan.nextDouble();

        System.out.println("Enter your credit score: ");
        credit = scan.nextInt();

        if (income > 10000){
            if (credit >= 500) {
                System.out.println("You are eligible for the mortgage");
            }
            else {
                System.out.println("Your credit score is too low");
            }
        } else {
            System.out.println("Your income is too low");
        }




    }

}
