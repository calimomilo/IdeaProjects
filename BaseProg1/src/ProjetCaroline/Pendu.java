package ProjetCaroline;

import ch.comem.Clavier;
import ch.comem.turtle.BigTurtle;

import java.awt.*;
import java.util.Random;



public class Pendu {

    public static void dessinPendu(BigTurtle annie, int step) {
        switch (step) {
            case 1 :
                annie.jumpTo(110, 300);
                annie.turnRight(90);
                annie.forward(80);
                annie.turnLeft(90);
                break;

            case 2 :
                annie.jumpTo(150, 300);
                annie.forward(200);
                break;

            case 3 :
                annie.jumpTo(150, 100);
                annie.turnRight(90);
                annie.forward(80);
                annie.turnLeft(90);
                break;

            case 4 :
                annie.jumpTo(230, 100);
                annie.turnRight(180);
                annie.forward(20);
                annie.turnLeft(180);
                break;

            case 5 :
                annie.jumpTo(230, 120);
                annie.turnRight(90);
                annie.turnRightRadius(360, 20);
                annie.turnLeft(90);
                break;

            case 6 :
                annie.jumpTo(230, 160);
                annie.turnRight(180);
                annie.forward(80);
                annie.turnLeft(180);
                break;

            case 7 :
                annie.jumpTo(230, 180);
                annie.turnRight(135);
                annie.forward(30);
                annie.turnLeft(135);
                break;

            case 8 :
                annie.jumpTo(230, 180);
                annie.turnLeft(135);
                annie.forward(30);
                annie.turnRight(135);
                break;

            case 9 :
                annie.jumpTo(230, 240);
                annie.turnRight(135);
                annie.forward(30);
                annie.turnLeft(135);
                break;

            case 10 :
                annie.jumpTo(230, 240);
                annie.turnLeft(135);
                annie.forward(30);
                annie.turnRight(135);
                break;
        }

    }

    public static void main(String[] args) {
        BigTurtle annie = new BigTurtle(700, 400, 800, 200, "pendu", Color.WHITE);
        annie.setPenFont(new Font("Courier", Font.PLAIN, 12));
        String[] mots = {"gourde", "trousse", "voiture", "tortue", "amour", "danser", "cafeine", "histoire", "gabor", "pinkas", "application", "nuage", "bouteille"};

        Random rand = new Random();
        String strMot = mots[rand.nextInt(mots.length)];
        char[] mot = strMot.toCharArray();
        // System.out.println(Arrays.toString(mot));

        annie.jumpTo(400, 30);
        annie.write("Je vais te faire deviner un mot de " + mot.length + " lettres.\nTape une lettre pour commencer !");
        annie.setPenFont(new Font("Courier", Font.PLAIN, 16));

        int compteur = 0;
        int lettres = mot.length;

        do {
            char saisie = Clavier.rend_char("");
            boolean found = false;

            for (int i = 0; i < mot.length; i++) {
                if (mot[i] == saisie) {
                    annie.jumpTo(430 + 20 * i, 80);
                    annie.write(mot[i]);
                    lettres--;
                    found = true;
                }
            }

            if (!found) {
                compteur++;
                dessinPendu(annie, compteur);
            }
        } while (compteur != 10 && lettres != 0);

        annie.setPenFont(new Font("Courier", Font.PLAIN, 12));
        annie.jumpTo(400, 120);
        if (compteur == 10) {
            annie.write("Vous avez perdu ! Le mot était " + strMot + ".");
        } else if (lettres == 0) {
            annie.write("Bravo ! Vous avez gagné avec " + compteur + " essais faux.");
        }
    }
}
