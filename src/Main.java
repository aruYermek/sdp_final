import Registraition.DatabaseConnection;
import Registraition.LogIn;
import Registraition.SignUp;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();

        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Signup");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        
        scanner.nextLine();

        switch (choice) {
            case 1:
                SignUp.signup();
                break;
            case 2:
                LogIn.login();
                break;
            case 3:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
        }
        }
    }
