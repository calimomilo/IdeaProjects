package ProjetCaroline;

import ch.comem.Clavier;
import ch.comem.turtle.BigTurtle;

import java.awt.*;
import java.util.Random;

public class Puissance4 {

    public static void writePlayer(BigTurtle rubiks, boolean player) {
        rubiks.setPenColor(Color.WHITE);
        int[] tabX = {270,270, 330, 330};
        int[] tabY = {90, 115, 115, 90};
        rubiks.fillPolygon(tabX,tabY,4);

        rubiks.jumpTo(270, 110);
        if (player) {
            rubiks.setPenColor(Color.ORANGE);
            rubiks.write("joueur 1");
        } else {
            rubiks.setPenColor(Color.RED);
            rubiks.write("joueur 2");
        }
    }

    public static void drawJeton(BigTurtle rubiks, int[] pos, boolean player) {
        if (player) {
            rubiks.setPenColor(Color.ORANGE);
        } else {
            rubiks.setPenColor(Color.RED);
        }

        rubiks.fillArc(pos[0]*50+69, pos[1]*50+154,40, 0, 360);
    }

    public static void main(String[] args) {
        BigTurtle rubiks = new BigTurtle(500, 600, 1000, 100, "pendu", Color.WHITE);
        rubiks.setPenFont(new Font("Courier", Font.PLAIN, 16));

        boolean player = true;
        int[][] grille = new int[6][7];
        boolean win = false;

        rubiks.turnRight(90);
        rubiks.jumpTo(150, 80);
        rubiks.write("Bienvenue à Puissance 4!");
        rubiks.jumpTo(155, 110);
        rubiks.write("C'est au tour du ");

        writePlayer(rubiks, player);

        rubiks.setPenColor(Color.BLACK);
        rubiks.jumpTo(65, 450);
        rubiks.forward(350);
        rubiks.turnLeft(90);

        for (int i = 0; i < 8; i++) {
            rubiks.jumpTo(65+(50*i), 450);
            rubiks.forward(300);
            if (i>0) {
                rubiks.jumpTo(35+(50*i), 480);
                rubiks.write(i);
            }
        }

        rubiks.turnRight(90);

        do {
            int[] pos = new int[2];
            int col = 0;
            do {
                col = Clavier.rend_int("");
                if (col > 7 || col < 1) {
                    System.out.println("Cette colonne n'existe pas.");
                }
            } while (col > 7 || col < 1);
            pos[1] = col-1;

            do {
                int i = 5;
                if (grille[i][pos[1]] == 0) {
                    i--;
                }
            } while (true);
        } while (win);
    }
}
