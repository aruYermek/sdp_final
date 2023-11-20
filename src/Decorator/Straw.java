package Decorator;

public class Straw implements ExtraProduct {
    @Override
    public String getDescription() {
        return "Straw";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}



