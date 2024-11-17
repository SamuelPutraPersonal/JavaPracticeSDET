package Fundamentals.ConditionalStatements;

import java.util.Scanner;

public class PracticeIf {

    public static void main (String [] args){
        // Declaration for variable
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check is the number positive or negative: ");
        a = scan.nextInt();

        if (a>0){
            System.out.println(a + " is positive number");
        } else if (a == 0){
            System.out.println(a + " is 0");
        } else {
            System.out.println(a + " is negative number");
        }
    }
}

