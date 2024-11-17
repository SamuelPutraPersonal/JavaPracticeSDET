package Fundamentals.ConditionalStatements;

import java.util.Scanner;

public class Practice {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter the number to check is the number odd or even: ");
        a = scan.nextInt();


        if (a %2 == 0) {
            System.out.println("Number is even");
        } else{
            System.out.println("number is odd");
        }
    }
}
