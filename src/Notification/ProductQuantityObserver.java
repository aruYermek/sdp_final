package Notification;

import Products.*;

public class ProductQuantityObserver implements Observer{
    @Override
    public void update(Observable observable) {
        Product product = (Product) observable;
        if (product.getQuantity() == 0) {
            System.out.println("Товар " + product.getName() + " с количеством 0 не может быть приобретен.");
        }
    }
}
