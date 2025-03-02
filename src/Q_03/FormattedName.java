package Q_03;
import java.util.Scanner;
public class FormattedName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        char middleInitial = middleName.charAt(0);
        middleInitial = Character.toUpperCase(middleInitial);

        System.out.println("Formatted Name: " + firstName + " " + middleInitial + ". " + lastName);
    }

}
