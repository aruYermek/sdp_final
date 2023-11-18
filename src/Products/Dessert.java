package Products;

public class Dessert extends Product{
    private String filling;
    public Dessert(int id, String name, int price, int quantity, String filling) {
        super(id, name, price, quantity);
        this.filling = filling;
    }
    @Override
    public String getName() {
        return super.getName() + " (" + filling + ")";
    }
}
