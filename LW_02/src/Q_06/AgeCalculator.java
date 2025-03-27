package Q_06;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();

        int age = currentYear - birthYear;

        System.out.printf("You were born in %d and will be (are) %d this year.%n", birthYear, age);

        scanner.close();
    }
}
