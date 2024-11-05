package serie4;

import ch.comem.Clavier;

public class S4ex10 {
    public static void main(String[] args) {
        int NB_TROUS = 18;
        byte nombreJoueurs = Clavier.rend_byte("Entrez le nombre de joueurs : ");
        String[] joueurs = new String[nombreJoueurs];
        int[][] points = new int[nombreJoueurs][NB_TROUS];

        for (int i = 0; i < nombreJoueurs; i++) {
            System.out.print("Joueur " + (i+1) + " : ");
            joueurs[i] = Clavier.rend_String("");
        }

        for (int i = 0; i < NB_TROUS; i++) {
            System.out.println("TROU " + (i+1));

            for (int j = 0; j < nombreJoueurs; j++) {
                System.out.println(joueurs[j] + " : ");
                int pts = Clavier.rend_int("");
                if (pts > 7) {
                    pts = 7;
                }
                points[j][i] = pts;
            }
            System.out.println();
        }

        int winnerPts = Integer.MAX_VALUE;
        String winnerJoueur = "";

        int loserPts = Integer.MIN_VALUE;
        String loserJoueur = "";

        for (int i = 0; i < nombreJoueurs; i++) {
            System.out.print(joueurs[i] + " :\t");

            int sumPts = 0;

            for (int j = 0; j < NB_TROUS; j++) {
                sumPts += points[i][j];
                System.out.print(points[i][j] + " ");
            }
            System.out.println("=> " + sumPts);
            if (sumPts < winnerPts) {
                winnerPts = sumPts;
                winnerJoueur = joueurs[i];
            } else if (sumPts > loserPts) {
                loserPts = sumPts;
                loserJoueur = joueurs[i];
            }
        }

        System.out.println("Gagnant : " + winnerJoueur + " (" + winnerPts + ")");
        System.out.println("Perdant : " + loserJoueur + "(" + loserPts + ")");
    }
}
