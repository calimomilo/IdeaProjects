package cours2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<Product>();
    private double totalPrice;

    /**
     * retourne un String avec une liste formatée des produits
     * @return liste des produits
     */
    public String getProducts() {
        String list = "";
        for (Product p : products) {
            list += p.toString() + "\n";
        }
        return list;
    }

    /**
     * donne le prix total du panier
     * @return le prix total
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * ajoute un produit au panier
     * @param p produit ajouté
     */
    public void addProduct(Product p) {
        products.add(p);
        totalPrice += p.getPrice();
    }

    /**
     * enlève un produit du panier
     * @param p le produit enlevé
     */
    public void removeProduct(Product p) {
        products.remove(p);
        totalPrice -= p.getPrice();
    }

    /**
     * affiche la liste des produits et le prix total du panier
     */
    public void display() {
        System.out.println(getProducts() + "Total : " + totalPrice + "\n");
    }

    /**
     * affiche le panier formatté
     *
     * à ajouter : groupement des produits, formattage des prix
     */
    public void formattedDisplay() {
        String msg = "";
        for (Product p : products) {
            msg += p.getName();

            for (int i = 0; i < 3 - (p.getName().length()/4); i++) {
                msg += "\t";
            }

            msg += String.format("%.2f", p.getPrice()) + " CHF\n";
        }
        msg += "Total\t\t" + totalPrice + " CHF\n";

        System.out.println(msg);
    }
}
