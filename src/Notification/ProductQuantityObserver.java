package Notification;

import Products.*;

public class ProductQuantityObserver implements Observer {

    @Override
    public void update(Product product) {
        if (product.getQuantity() == 0) {
            System.out.println("Attention: Product " + product.getName() + " is out of stock!");
        }
    }
}
