import cours2.*;

public class Main {
    public static void main(String[] args) {
        /* EXERCICE SHOPPING CART */

        Product p1 = new Product("chocolat", 3.50, 0.5);
        Product p2 = new Product("banane", 0.95, 0.5);
        Product p3 = new Product("pain", 5.60, 0.5);
        Shoe s1 = new Shoe("trainers", 50.40, 3.10, 39);
        Table t1 = new Table("table basse", 230, 25, 8);
        App a1 = new App("spotify", 4.50, 0, "v2.14", "spotify.link");
        SoftwareLicense l1 = new SoftwareLicense("lobe", 87.50, 0, "v2.14", "lobe.link");

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
        sc.addProduct(s1);
        sc.addProduct(t1);
        sc.addProduct(a1);
        sc.addProduct(l1);
        sc.display();
        sc.formattedDisplay();
    }
}
