package Q_08;

import java.util.Scanner;

public class SplitStringAtExclamation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing a single exclamation mark (!): ");
        String input = scanner.nextLine();

        int exclamationIndex = input.indexOf('!');

        if (exclamationIndex == -1) {
            System.out.println("The input string does not contain an exclamation mark.");
        } else {

            String beforeExclamation = input.substring(0, exclamationIndex).trim();

            String afterExclamation = input.substring(exclamationIndex + 1).trim();

            System.out.println("Before exclamation mark: " + beforeExclamation);
            System.out.println("After exclamation mark: " + afterExclamation);
        }

        scanner.close();
    }
}