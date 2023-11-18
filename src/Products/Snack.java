package Products;

public class Snack extends Product {

    private int weight;
    private String taste;

    public Snack(int id, String name, int price, int quantity, int weight, String taste) {
        super(id, name,price,quantity);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String getName() {
        return super.getName() + " (weight: " + weight + " г)";
    }

}

