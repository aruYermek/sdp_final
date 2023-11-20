package Decorator;
import Products.*;


public class NapkinDecorator extends ProductDecorator{
    public NapkinDecorator(Product baseProduct){
        super(baseProduct);

    }
    @Override
    public String getName() {
        return baseProduct.getName() + " with Napkin";
    }
    @Override
    public int extraPrice() {
        return new Napkin().getPrice();
    }
}
