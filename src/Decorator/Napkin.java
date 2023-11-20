package Decorator;

public class Napkin implements ExtraProduct {
    @Override
    public String getDescription() {
        return "Napkin";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}

