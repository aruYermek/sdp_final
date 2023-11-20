package Decorator;

public class Ice implements ExtraProduct {
    @Override
    public String getDescription() {
        return "Ice";
    }

    @Override
    public int getPrice() {
        return 70;
    }
}



