package Q_07;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        scanner.close();
    }
}
