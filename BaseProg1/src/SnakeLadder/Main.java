package SnakeLadder;

import ch.comem.Clavier;

public class Main {

    public static int saisieCheck(String msg, int limInf, int limSup) {
        int saisie = 0;
        do {
            saisie = Clavier.rend_int(msg);

            if (saisie > limSup || saisie < limInf) {
                System.out.println("Veuillez saisir un nombre entre " + limInf + " et " + limSup + ".");
            }
        } while (saisie > limSup || saisie < limInf);
        return saisie;
    }

    public static void saisieJoueurs(int nombre, String[] nJ, int[] aJ) {
        for (int i = 0; i < nombre; i++) {
            nJ[i] = Clavier.rend_String("Veuillez saisir le prénom " +
                    (i==0? "d'un joueur" : "de la personne à droite de " + nJ[i-1]) + " : ");
            do {
                aJ[i] = Clavier.rend_int("Veuillez saisir l'âge de " + nJ[i] + " : ");
                if (aJ[i] < 4) {
                    System.out.println("Veuillez saisir un âge supérieur à 4.");
                }
            } while (aJ[i] < 4);

        }
    }

    public static int newPos(int pos, int lancer) {
        int newPos = pos + lancer;
        switch (newPos) {
            case 1 : newPos = 9; break;
            case 4 : newPos = 13; break;
            case 6 : newPos = 5; break;
            case 8 : newPos = 2; break;
            case 17 : newPos = 7; break;
            case 19 : newPos = 10; break;
            case 20, 28 : newPos = 22; break;
            case 24, 26 : newPos = 18; break;
            case 27 : newPos = 23; break;
            case 29 : newPos = 21; break;
            default: break;
        }
        return newPos;
    }

    public static void main(String[] args) {
        int nbrJoueurs = saisieCheck("Veuillez saisir le nombre de joueurs : ", 2, 4);
        System.out.println();

        String[] nomJoueurs = new String[nbrJoueurs];
        int[] ageJoueurs = new int[nbrJoueurs];
        saisieJoueurs(nbrJoueurs, nomJoueurs, ageJoueurs);
        System.out.println();

        // get le joueur le plus jeune
        byte index = 0;
        for (byte i = 1; i < ageJoueurs.length; i++) {
            if (ageJoueurs[i] < ageJoueurs[index]) {
                index = i;
            }
        }

        int[] posJoueurs = new int[nbrJoueurs];
        boolean fin = false;
        do {
            int lancer = saisieCheck(nomJoueurs[index] + ", lance le dé. Quelle est sa valeur ? ", 1, 6);
            posJoueurs[index] = newPos(posJoueurs[index], lancer);

            if (posJoueurs[index] == 25) {
                fin = true;
            } else {
                for (int i = 0; i < posJoueurs.length; i++) {
                    if (posJoueurs[i] == posJoueurs[index] && i != index) {
                        posJoueurs[index] = 0;
                    }
                }

                for (int i = 0; i < nomJoueurs.length; i++) {
                    System.out.println("\t" + nomJoueurs[i] + " : " + posJoueurs[i]);
                }

                index--;
                if (index < 0) {
                    index = (byte) (nbrJoueurs-1);
                };
            }

        } while (!fin);

        System.out.println("Bravo " + nomJoueurs[index] + ", tu as gagné !");
    }
}
