package Products;

public class Drink extends Product{
    private String type;
    public Drink(int id, String name, int price, int quantity, String type) {
        super(id, name, price, quantity);
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() + " (" + type + ")";
    }
}

