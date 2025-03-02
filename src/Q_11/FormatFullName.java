package Q_11;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            char middleInitial = middleName.charAt(0);
            middleInitial = Character.toUpperCase(middleInitial);

            String formattedName = lastName + ", " + firstName + " " + middleInitial + ".";

            System.out.println("Formatted Name: " + formattedName);
        } else {

            System.out.println("Invalid input. Please enter your full name in the format 'first middle last'.");
        }

        scanner.close();
    }
}
