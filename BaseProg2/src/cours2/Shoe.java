package cours2;

public class Shoe extends Product {
    private int size;

    public Shoe(String name, double price, double shipping, int size) {
        super(name, price, shipping);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
