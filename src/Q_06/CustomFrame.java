package Q_06;
import javax.swing.*;
import java.util.Scanner;

public class CustomFrame {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the width (W)
        System.out.print("Enter the width of the frame (W): ");
        int width = scanner.nextInt();

        // Prompt the user for the height (H)
        System.out.print("Enter the height of the frame (H): ");
        int height = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        // Prompt the user for the title of the frame
        System.out.print("Enter the title of the frame: ");
        String title = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Create a JFrame with the specified title
        JFrame frame = new JFrame(title);

        // Set the size of the frame using the user-provided width and height
        frame.setSize(width, height);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}