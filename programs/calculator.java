package programs;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Welcome to my calculator".toUpperCase());
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            // creating the scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number:");
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.println("the sum of your numbers is " + sum);

            } else if (choice == 2) {
                System.out.print("Enter first number ");
                int num1 = input.nextInt();
                System.out.print("Enter second number ");
                int num2 = input.nextInt();
                int Subtraction = num1 - num2;
                System.out.println("the Subtraction of your numbers is " + Subtraction);

            } else if (choice == 3) {
                System.out.print("Enter first number ");
                int num1 = input.nextInt();
                System.out.print("Enter second number ");
                int num2 = input.nextInt();
                int multiply = num1 * num2;
                System.out.println("the Multiplication of your numbers is " + multiply);

            } else if (choice == 4) {
                System.out.print("Enter your first number ");
                int num1 = input.nextInt();
                System.out.print("Enter your second number ");
                int num2 = input.nextInt();
                int Division = num1 / num2;
                System.out.println("the division of your numbers is " + Division);
            } else if (choice == 5) {
                break;

            } else {
                System.out.println("opps invalid choice please Enter a valid option!!");
            }
        }
        

    }
}
