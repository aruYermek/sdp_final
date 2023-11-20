package Decorator;
import Products.*;

public abstract class ProductDecorator extends Product {
    protected Product baseProduct;

    public ProductDecorator(Product baseProduct) {
        super(baseProduct.getId(), baseProduct.getName(), baseProduct.getPrice(), baseProduct.getQuantity());
        this.baseProduct = baseProduct;
    }

    @Override
    public int getPrice() {
        return baseProduct.getPrice() + extraPrice();
    }

    public abstract int extraPrice();
}
