package cours2;

public class Shoe extends Product {
    private int size;

    public Shoe(String name, int price, int shipping, int size) {
        super(name, price, shipping);
        this.size = size;
    }
}
