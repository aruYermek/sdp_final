package Decorator;
import Products.*;

public class StrawDecorator extends ProductDecorator {
    public StrawDecorator(Product baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getName() {
        return baseProduct.getName() + " with Straw";
    }

    @Override
    public int extraPrice() {
        return new Straw().getPrice();
    }
}


