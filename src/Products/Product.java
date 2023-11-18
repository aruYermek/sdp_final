package Products;
import Notification.*;

import java.util.ArrayList;
import java.util.List;


public abstract class Product implements Observable {
    private int id;
    private String name;
    private int price;
    private int quantity;

    private List<Observer> observers = new ArrayList<>();


    public Product(int id, String name, int price, int quantity){
        this.id=id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}


