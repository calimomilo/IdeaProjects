package cours2;

public class Table extends Product {
    private int weight;

    public Table(String name, double price, double shipping, int weight) {
        super(name, price, shipping);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
