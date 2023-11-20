package Products;

import Adapter.*;
import Decorator.*;
import Notification.*;
import Payment.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Product> products;
    private boolean isShopping = true;
    private Scanner scanner;
    private CurrencyAdapter currencyAdapter;

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

            scanner = new Scanner(System.in);
        }

    public void printMenu() {
        while (isShopping) {
            System.out.println("Choose currency:");
            System.out.println("1. KZT");
            System.out.println("2. USD");
            System.out.println("3. EUR");


            int currencyChoice = scanner.nextInt();
            scanner.nextLine();

            switch (currencyChoice) {
                case 1:
                    currencyAdapter=null;
                    break;
                case 2:
                    currencyAdapter = new DollarCurrencyAdapter();
                    break;
                case 3:
                    currencyAdapter= new EuroCurrencyAdapter();
                    break;
                default:
                    currencyAdapter = null;
                    break;
            }

            System.out.println("Menu:");
            System.out.println("---------------------------");
            for (Product product : products) {
                double priceToDisplay = (currencyAdapter == null) ? product.getPrice() : currencyAdapter.convertToCurrency(product.getPrice());
                System.out.println(product.getId() + ". " + product.getName() + " - " + priceToDisplay + " quantity: " + product.getQuantity());
            }
            System.out.println("---------------------------");
            System.out.println("Choose the id of the product: ");

            int productId = scanner.nextInt();
            scanner.nextLine();

            Product product = null;

            for (Product p : products) {
                if (p.getId() == productId) {
                    product = p;
                    break;
                }
            }

            if (product != null && product.getQuantity() > 0) {
                Product selectedProduct = product;

                System.out.println("Do you want to add Straw? (yes/no): ");
                String addStrawInput = scanner.nextLine().toLowerCase();
                boolean addStraw = addStrawInput.equals("yes");

                if (addStraw) {
                    selectedProduct = new StrawDecorator(selectedProduct);
                }

                System.out.println("Do you want to add Ice? (yes/no): ");
                String addIceInput = scanner.nextLine().toLowerCase();
                boolean addIce = addIceInput.equals("yes");

                if (addIce) {
                    selectedProduct = new IceDecorator(selectedProduct);
                }

                System.out.println("Do you want to add Napkin? (yes/no): ");
                String addNapkinInput = scanner.nextLine().toLowerCase();
                boolean addNapkin = addNapkinInput.equals("yes");

                if (addNapkin) {
                    selectedProduct = new NapkinDecorator(selectedProduct);
                }
                double selectedPrice = (currencyAdapter == null) ? selectedProduct.getPrice() : currencyAdapter.convertToCurrency(selectedProduct.getPrice());
                System.out.println("Final Price: " + selectedPrice);
                System.out.println("Choose the payment method: ");
                System.out.println("1. Card");
                System.out.println("2. QR");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the card number: ");
                        int cardNumber = scanner.nextInt();
                        PayWithCard payWithCard = new PayWithCard(cardNumber);
                        payWithCard.processPayment(selectedPrice);
                        break;
                    case 2:
                        PayWithQr payWithQr = new PayWithQr();
                        payWithQr.processPayment(selectedPrice);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }

                product.decreaseQuantity();
                System.out.println("Product purchased successfully!");
            } else if (product != null && product.getQuantity() == 0) {
                ProductQuantityObserver observer = new ProductQuantityObserver();
                product.addObserver(observer);
                product.decreaseQuantity();
            } else {
                System.out.println("Invalid product ID. Please try again.");
            }

            System.out.println("Do you want to continue shopping? (true/false): ");
            isShopping = scanner.nextBoolean();
        }
    }
}
