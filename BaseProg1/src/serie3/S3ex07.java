package serie3;

import ch.comem.Clavier;

public class S3ex07 {
    public static void main(String[] args) {
        int saisie = Clavier.rend_int("Entrez un nombre entier : ");
        int somme = 0;

        for (int i = 1; i <= saisie; i++) {
            somme += i;
            // System.out.println(i);
        }

        System.out.println("La somme des chiffres de 1 à " + saisie + " est égale à " + somme);
    }
}
