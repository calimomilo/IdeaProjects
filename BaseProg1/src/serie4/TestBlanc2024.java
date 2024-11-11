package serie4;

import ch.comem.Clavier;

public class TestBlanc2024 {
    public static void main(String[] args) {
        short ptsRestants = 301;
        byte score = 0;
        byte multiplicateur = 0;

        System.out.println("Vos points : " + ptsRestants);

        do {
            do {
                score = Clavier.rend_byte("Entrez votre score : ");
            } while (score < 0 || (score > 20 && score !=25 && score != 50));

            if (score <= ptsRestants) {
                if (score != 0 && score != 25 && score != 50) {
                    do {
                        multiplicateur = Clavier.rend_byte("Si vous êtes dans une zone simple, tapez 1.\nSi vous " +
                                "êtes dans une zone double, tapez 2.\nSi vous êtes dans une zone triple, tapez 3.");
                    } while (multiplicateur < 1 || multiplicateur > 3);

                    score = (byte) (score * multiplicateur); // ou score *= multiplicateur

                    if (score <= ptsRestants) {
                        ptsRestants -= score;    // ou ptsRestants = ptsRestants - score
                    }
                } else {
                    ptsRestants -= score;
                }
            }

            System.out.println("Vos points : " + ptsRestants);

        } while (ptsRestants != 0);

        System.out.println("Bravo !!");


























//        int decomptePts = 301;
//        int ptsAEnlever = 0;
//        int lancers = 0;
//
//        System.out.println("\n-----------\nVos points : " + decomptePts + "\n-----------\n");
//
//        while (decomptePts > 0) {
//            ptsAEnlever = Clavier.rend_byte("Entrez le nombre où est la fléchette : ");
//
//            if (ptsAEnlever != 25 && ptsAEnlever != 50 && ptsAEnlever > 20 || ptsAEnlever < 0) {
//                System.out.println("Saisie invalide.\n");
//            } else {
//                if (ptsAEnlever <= decomptePts && ptsAEnlever != 0 && ptsAEnlever != 25 && ptsAEnlever!= 50) {
//                    byte saisie = 0;
//                    do {
//                        saisie = Clavier.rend_byte("\nSi la fléchette est dans une zone simple, entrez 1." +
//                                "\nSi la fléchette est dans une zone double, entrez 2." +
//                                "\nSi la fléchette est dans une zone triple, entrez 3.\n");
//                        if (saisie < 1 || saisie > 3) {
//                            System.out.println("\nSaisie invalide.");
//                        }
//                    } while (saisie < 1 || saisie > 3);
//
//                    switch (saisie) {
//                        case 1: break;
//                        case 2: ptsAEnlever*= 2; break;
//                        case 3: ptsAEnlever*=3; break;
//                    }
//                }
//
//                if (ptsAEnlever <= decomptePts) {
//                    decomptePts -= ptsAEnlever;
//                }
//
//                lancers++;
//                System.out.println("\n-----------\nVos points : " + decomptePts + "\n-----------\n");
//            }
//        }
//        System.out.println("Bravo ! Vous avez gagné en " + lancers + " lancers.\n");
    }
}
