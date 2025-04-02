package cours2;

public class Product {
    private String name;
    private double price;
    private double shipping;

    public Product(String name, double price, double shipping) {
        this.name = name;
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

    public String toString() {
        return name + " : " + price + " (" + shipping + ")";
    }
}
