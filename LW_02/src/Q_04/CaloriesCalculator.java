package Q_04;

import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        double calories = bodyWeight * 19;

        System.out.printf("You need %.2f calories per day.%n", calories);

        scanner.close();
    }
}
