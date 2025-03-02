package Q_01;

import javax.swing.JFrame;
public class WelcomeWindow {

    public static void main(String[] args) {


        JFrame window = new JFrame("Welcome to Java");

        window.setSize(800, 600);

        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}