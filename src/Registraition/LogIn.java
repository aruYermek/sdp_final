package Registraition;
import Products.Menu;

import java.util.Scanner;

public class LogIn {
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (DatabaseConnection.getInstance().login(username, password)) {
            System.out.println("Login successful!");
            Menu menu = new Menu();
            menu.printMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
