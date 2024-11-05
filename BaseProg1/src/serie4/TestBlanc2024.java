package serie4;

import ch.comem.Clavier;

public class TestBlanc2024 {
    public static void main(String[] args) {
        int decomptePts = 301;
        int ptsAEnlever = 0;
        int lancers = 0;

        System.out.println("\n-----------\nVos points : " + decomptePts + "\n-----------\n");

        while (decomptePts > 0) {
            ptsAEnlever = Clavier.rend_byte("Entrez le nombre où est la fléchette : ");

            if (ptsAEnlever != 25 && ptsAEnlever != 50 && ptsAEnlever > 20 || ptsAEnlever < 0) {
                System.out.println("Saisie invalide.\n");
            } else {
                if (ptsAEnlever <= decomptePts && ptsAEnlever != 0 && ptsAEnlever != 25 && ptsAEnlever!= 50) {
                    byte saisie = 0;
                    do {
                        saisie = Clavier.rend_byte("\nSi la fléchette est dans une zone simple, entrez 1." +
                                "\nSi la fléchette est dans une zone double, entrez 2." +
                                "\nSi la fléchette est dans une zone triple, entrez 3.\n");
                        if (saisie < 1 || saisie > 3) {
                            System.out.println("\nSaisie invalide.");
                        }
                    } while (saisie < 1 || saisie > 3);

                    switch (saisie) {
                        case 1: break;
                        case 2: ptsAEnlever*= 2; break;
                        case 3: ptsAEnlever*=3; break;
                    }
                }

                if (ptsAEnlever <= decomptePts) {
                    decomptePts -= ptsAEnlever;
                }

                lancers++;
                System.out.println("\n-----------\nVos points : " + decomptePts + "\n-----------\n");
            }
        }
        System.out.println("Bravo ! Vous avez gagné en " + lancers + " lancers.\n");
    }
}
