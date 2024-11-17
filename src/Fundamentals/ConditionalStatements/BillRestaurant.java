package Fundamentals.ConditionalStatements;

import java.util.Scanner;

public class BillRestaurant {
    public static void main ( String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Sam's Restaurant");
        System.out.println("1. Appetizer");
        System.out.println("2. Main course");
        System.out.println("3. Dessert");
        System.out.println("Enter your category to choose the food: ");
        int category = scan.nextInt();

        // variable to total the bill
        double total = 0;

        switch (category) {

            case 1:
                System.out.println("You selected appetizer");
                System.out.println("1. Soup - 5$");
                System.out.println("2. Salad - 4$");
                System.out.println("What is your choice: ");
                int appetizer = scan.nextInt();

                switch (appetizer) {
                    case 1:
                        total += 5;
                        break;
                    case 2:
                        total += 4;
                        break;
                    default:
                        System.out.println("Invalid choice. You don't choose the appetizer");
                }
            case 2:
                System.out.println("You selected Main Course");
                System.out.println("Steak - 20$");
                System.out.println("Salmon - 17$");
                System.out.println("Mendi Rice - 15$");
                int mainCourse = scan.nextInt();

                switch (mainCourse){
                    case 1:
                        total += 20;
                        break;
                    case 2:
                        total += 17;
                        break;
                    case 3 :
                        total += 15;
                        break;
                    default:
                        System.out.println("Invalid choice. Main course is not selected");
                }
            case 3 :
                System.out.println("You selected dessert");
                System.out.println("1. Pudding - 7$");
                System.out.println("2. Ice cream - 5$");
                int dessert = scan.nextInt();

                switch (dessert){
                    case 1:
                        total += 7;
                        break;
                    case 2:
                        total += 5;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        // display total bill
        System.out.println("Your total bill is: " + total);
    }
}
