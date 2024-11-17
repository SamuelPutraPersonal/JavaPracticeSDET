package Fundamentals.ConditionalStatements;

import java.util.Scanner;

public class Grade {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        int grade;

        System.out.println("Enter your grade between 0-100: ");
        grade = scan.nextInt();

        if (grade <0 || grade > 100) {
            System.out.println("Invalid grade. Enter your number between 0-100");
        } else {
            if (grade > 90) {
                System.out.println("Your grade is A");
            }
            else if ( grade > 80) {
                System.out.println("Your grade is B");
            }
            else if (grade > 70){
                System.out.println("Your grade is C");
            }
            else {
                System.out.println("Your grade is D");
            }
        }
    }
}
