package m531penaparra;

import ch.comem.Clavier;
import ch.comem.turtle.BigTurtle;

import java.awt.*;
import java.util.Random;

public class M531PenaParra {

    // dessine une tuile
    public static void drawTuile(BigTurtle tortie, int posX, int posY, int largeur) {
        int[] tabX = {posX, posX + largeur, posX + largeur, posX};
        int[]tabY = {posY, posY, posY + largeur, posY + largeur};
        tortie.fillPolygon(tabX, tabY, tabX.length);
        tortie.fillArc(posX, posY + largeur/2, largeur, 180, 180);
    }

    // demande de saisie avec contrôle selon limites supérieures et inférieures
    public static int askNombre(int min, int max, String msg) {
        int nombre = 0;

        do {
            nombre = Clavier.rend_int(msg);
            if (nombre < min) {
                System.out.println("Veuillez saisir un nombre supérieur ou égal à " + min + " !");
            } else if (nombre > max) {
                System.out.println("Veuillez saisir un nombre inférieur ou égal à " + max + " !");
            }
        } while (nombre < min || nombre > max);

        return nombre;
    }

    // placement d'un certain nombre de 1 dans un tableau vide
    public static void placeRandom(int[][] tab, int nombre) {
        Random rand = new Random();

        for (int i = 0; i < nombre; i++) {
            boolean notPlaced = true;
            do {
                int x = rand.nextInt(tab.length);
                int y = rand.nextInt(tab[0].length);

                if (tab[x][y] == 0) {
                    tab[x][y] = 1;
                    notPlaced = false;
                }
            } while (notPlaced);
        }
    }

    // calcul de la taille maximale d'une tuile pour que l'ensemble rentre dans la fenêtre
    public static int calcTaille(BigTurtle tortie, int[][] tab) {
        int largeurTot = tortie.getWidth()-100;
        int hauteurTot = tortie.getHeight()-100;

        return (int) Math.min(largeurTot/(1.0*tab.length), hauteurTot/(1.5*tab[0].length));
    }

    // affichage du toit
    public static void showToit(BigTurtle tortie, int[][] tab, int taille) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == 0) {
                    tortie.setPenColor(Color.ORANGE);
                } else {
                    tortie.setPenColor(Color.RED);
                }
                drawTuile(tortie, i*taille + 45, (int)(j*taille*1.5) + 35, taille);
            }
        }
    }

    // affichage du plan de pose des tuiles
    public static void showPlan(int[][] tab) {
        for (int j = 0; j < tab[0].length; j++) {
            System.out.print("Ligne " + (j+1) + " : ");
            int counter = 1;
            for (int i = 0; i < tab.length; i++) {
                if (i == tab.length - 1) {
                    System.out.print(counter + ((tab[i][j] == 0)? " orange(s)." : " rouge(s)."));
                    counter = 1;
                } else if (tab[i][j] == tab[i+1][j]) {
                    counter++;
                } else {
                    System.out.print(counter + ((tab[i][j] == 0)? " orange(s), " : " rouge(s), "));
                    counter = 1;
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        BigTurtle tortie = new BigTurtle(500, 600, 1000, 100, "tuiles", Color.WHITE);

        // Le nombre maximal de rangées et de tuiles par rangées est calculé en fonction de la taille de la fenêtre de
        // sorte à ce que chaque tuile fasse au moins un pixel.

        int rangees = askNombre(1, (int)((tortie.getHeight()-100)/1.5), "Combien de rangées voulez-vous ? ");
        int largeur = askNombre(1, tortie.getWidth()-100, "Combien de tuiles par rangée voulez-vous ? ");
        int rouges = askNombre(0, rangees*largeur, "Combien de tuiles rouges voulez-vous ? ");

        int[][] toit = new int[largeur][rangees];
        int taille = calcTaille(tortie, toit);
        placeRandom(toit, rouges);

        showToit(tortie, toit, taille);
        showPlan(toit);
    }
}
