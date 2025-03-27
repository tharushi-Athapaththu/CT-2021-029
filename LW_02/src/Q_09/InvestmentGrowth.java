package Q_09;

import java.util.Scanner;

public class InvestmentGrowth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (R) in percent: ");
        double R = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int N = scanner.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.printf("The amount of money earned after %d years is: %.2f%n", N, amount);

        scanner.close();
    }
}
