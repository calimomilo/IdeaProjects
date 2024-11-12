package m531penaparra;

import ch.comem.Clavier;

public class M531PenaParraProbleme2 {
    public static void main(String[] args) {
        byte quantite = 0;
        do {
            quantite = Clavier.rend_byte("Veuillez saisir le nombre de personnes pour qui on peut voter [1-10] : ");
            if (quantite < 1 || quantite > 10) {
                System.out.println("Saisie invalide.");
            }
        } while (quantite < 1 || quantite > 10);

        String[] personnes = new String[quantite];
        for (int i = 0; i < quantite; i++) {
            personnes[i] = Clavier.rend_String("Nom de la personne " + (i + 1) + " : ");
        }

        byte[] votes = new byte[quantite];
        byte choix = 0;

        do {
            System.out.println("\nPour qui voulez vous voter : ");
            for (int i = 0; i < quantite; i++) {
                System.out.println((i+1) + ".) " + personnes[i] + " : " + votes[i]);
            }
            System.out.println(quantite+1 + ".) -- Quitter --");

            do {
                choix = Clavier.rend_byte("Veuillez indiquer votre choix : ");
                if (choix < 1 || choix > quantite+1) {
                    System.out.println("\nSaisie invalide.");
                }
            } while (choix < 1 || choix > quantite+1);

            if (choix != quantite+1) {
                for (int i = 0; i < quantite; i++) {
                    if (choix - 1 == i) {
                        votes[i]++;
                    }
                }
            }

        } while (choix != quantite+1);

        System.out.println("\nMerci d'avoir voté :-)");
    }
}
