package serie3;

import ch.comem.Clavier;

public class S3ex04 {
    public static void main(String[] args) {
        double capital = Clavier.rend_double("Entrez le capital de départ (>0) : ");
        byte interet = Clavier.rend_byte("Entrez le taux d'intérêt en % : ");
        byte periodes = Clavier.rend_byte("Entrez le nombre de périodes (>0) : ");

        System.out.println("Une somme de " + capital + " placée durant " + periodes
                + " période(s) avec un taux d'intérêt de " + interet + "% génère :");
        for (int i = 1; i <= periodes; i++) {
            capital += capital*interet/100;
            System.out.println("après " + i + " période(s) : " + capital);
        }

    }
}
