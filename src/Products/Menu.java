package Products;
import Notification.ProductQuantityObserver;
import Payment.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Product> products;
    public Menu() {
        products = new ArrayList<>();
        products.add(new Drink(1, "Coca Cola", 350, 2, "classic"));
        products.add(new Drink(2, "Coca Cola", 350, 5, "zero"));
        products.add(new Drink(3, "Pepsi", 350, 5, "classic"));
        products.add(new Drink(4, "Lipton", 350, 2, "green tea"));
        products.add(new Drink(5, "Lipton", 350, 0, "black tea"));
        products.add(new Snack(6, "Lay's", 560, 4, 120, "cheese"));
        products.add(new Snack(7, "Lay's", 560, 4, 240, "cheese"));
        products.add(new Snack(8, "Lay's", 560, 4, 120, "Crab"));
        products.add(new Dessert(9, "Eclair", 400, 3, "chocolate"));
        products.add(new Dessert(10, "Eclair", 400, 1, "cream"));

    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("---------------------------");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getId() + ". " + products.get(i).getName() + " - " + products.get(i).getPrice() + " quantity: " + products.get(i).getQuantity());
        }

        System.out.println("---------------------------");
        System.out.println("Choose the id of product: ");

        int productId = scanner.nextInt();

        for (Product product : products) {
            if (product.getId() == productId) {
                if (product.getQuantity() == 0) {
                    ProductQuantityObserver observer = new ProductQuantityObserver();
                    product.addObserver(observer);

                } else {
                    System.out.println("Price of product " + product.getName() + ": " + product.getPrice());
                    System.out.println("Choose the payment method: ");
                    System.out.println("1. Card");
                    System.out.println("2. Or");

                    int choice = scanner.nextInt();

                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the card number: ");
                            int cardNumber = scanner.nextInt();
                            PayWithCard payWithCard = new PayWithCard(cardNumber);
                            payWithCard.processPayment(product.getPrice());
                            break;
                        case 2:
                            PayWithQr payWithQr = new PayWithQr();
                            payWithQr.processPayment(product.getPrice());
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                }
            }
        }
    }
}
