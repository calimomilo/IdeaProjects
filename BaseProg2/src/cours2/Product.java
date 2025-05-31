package cours2;

public class Product {
    private String name;
    private double price;
    private double shipping;
    private int id;
    private static int counter;

    public Product(String name, double price, double shipping) {
        this.name = name;
        counter++;
        this.id = counter;
        setPrice(price);
        setShipping(shipping);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("prix invalide");
        } else {
            this.price = price;
        }
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        if (shipping < 0) {
            System.out.println("prix invalide");
        } else {
            this.shipping = shipping;
        }
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String toString() {
        return name + " : " + price + " (" + shipping + ")";
    }
}
