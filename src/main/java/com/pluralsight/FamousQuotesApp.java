package com.pluralsight;
import java.util.Scanner;
import java.util.Random;

public class FamousQuotesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create an array with 10 quotes
        String[] quotes = {
                "Believe in yourself.",
                "Never give up on your dreams.",
                "Every day is a new beginning.",
                "Hard work pays off.",
                "Stay positive and keep going.",
                "Learning never stops.",
                "Success takes time.",
                "Be kind to others.",
                "Mistakes help us learn.",
                "Always do your best."
        };

        String answer = "yes";

        // Keep asking the user if they want another quote
        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("\nWelcome to Famous Quotes!");
            System.out.println("Choose a number from 1 to 10.");
            System.out.println("Enter 0 for a random quote.");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    int randomNumber = random.nextInt(10);
                    System.out.println("Quote: " + quotes[randomNumber]);

                } else {
                    System.out.println("Quote: " + quotes[choice - 1]);
                }

            } catch (Exception e) {
                System.out.println("Invalid choice! Please try again.");
                scanner.nextLine();
            }

            System.out.print("\nDo you want to see another quote? (yes/no): ");
            answer = scanner.next();
        }

        System.out.println("Thank you for using Famous Quotes!");

        scanner.close();
    }

}
