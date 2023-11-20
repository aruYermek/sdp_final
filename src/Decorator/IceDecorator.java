package Decorator;
import Products.*;

public class IceDecorator extends ProductDecorator {
    public IceDecorator(Product baseProduct){
        super(baseProduct);

    }
    @Override
    public String getName() {
        return baseProduct.getName() + " with Ice";
    }

    @Override
    public int extraPrice() {
        return new Ice().getPrice();
    }
}
