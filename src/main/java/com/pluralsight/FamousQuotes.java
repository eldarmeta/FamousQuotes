package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        String[] quotes = {
                "Better than a thousand days of diligent study is one day with a great teacher.",
                "Fall seven times, stand up eight.",
                "Don't let a narrow mind limit your world.",
                "No risk, no reward.",
                "Fast means slow, and slow means fast.",
                "One kind word can warm three winter months.",
                "It doesn't matter how slowly you go, as long as you do not stop.",
                "Teachers open the door, but you must enter by yourself.",
                "He who asks a question is a fool for five minutes; he who does not ask remains a fool forever.",
                "Man plans, but the sky decides."
        };

        while (running) {
            System.out.print("Please enter number (1 - 10) or 'r' (for random): ");
            String choice = scanner.nextLine().trim();

            try {
                if (choice.equalsIgnoreCase("r")) {
                    int randomIndex = random.nextInt(quotes.length);
                    System.out.println("Random quote: " + quotes[randomIndex]);
                } else {
                    int number = Integer.parseInt(choice);
                    System.out.println("Quote " + number + ": " + quotes[number - 1]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers from 1 to 10 or 'r' for random.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter numbers from 1 to 10.");
            }
        }
         scanner.close();
    }
}
