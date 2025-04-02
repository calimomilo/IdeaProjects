import cours2.Product;
import cours2.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        /* EXERCICE SHOPPING CART (COURS2) */

        Product p1 = new Product("chocolat", 3.50, 0.5);
        Product p2 = new Product("banane", 0.95, 0.5);
        Product p3 = new Product("pain", 5.60, 0.5);

        ShoppingCart sc = new ShoppingCart();

        /*
        System.out.println(sc.getProducts());
        sc.addProduct(p1);
        System.out.println(sc.getProducts());
        sc.addProduct(p2);
        System.out.println(sc.getProducts());
        sc.addProduct(p3);
        sc.addProduct(p1);
        sc.addProduct(p1);
        System.out.println(sc.getProducts());
        System.out.println(sc.getTotalPrice());
        sc.removeProduct(p1);
        System.out.println(sc.getProducts());
        sc.display();
         */

        sc.addProduct(p1);
        sc.addProduct(p2);
        sc.addProduct(p3);
        sc.addProduct(p1);
        sc.addProduct(p1);
        sc.addProduct(p3);
        sc.display();
        sc.formattedDisplay();
    }
}
