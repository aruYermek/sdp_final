package Registraition;
import Products.Menu;

import java.util.Scanner;

public class SignUp {
    public static void signup() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        DatabaseConnection.getInstance().signup(username, password);
        System.out.println("User registered successfully!");

        Menu menu = new Menu();
        menu.printMenu();
    }
}
