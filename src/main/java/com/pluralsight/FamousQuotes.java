package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {"Better than a thousand days of diligent study is one day with a great teacher.",
        "Fall seven times, stand up eight.",
        "Don't let a narrow mind limit your world.",
                "No risk, no reward",
        "Fast means slow, and slow means fast.",
        "One kind word can warm three winter months.",
                "It doesn't matter how slowly you go, as long as you do not stop.",
        "Teachers open the door, but you must enter by yourself.",
        "He who asks a question is a fool for five minutes; he who does not ask remains a fool forever.",
                "Man plans, but the sky decides."};

        System.out.print("Please enter number (1 - 10): ");
        int choice = scanner.nextInt();
        System.out.print("Your quote is: " + quotes[choice-1]);

    }
}
