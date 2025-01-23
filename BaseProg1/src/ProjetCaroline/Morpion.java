package ProjetCaroline;

import ch.comem.Clavier;
import ch.comem.turtle.BigTurtle;

import java.awt.*;
import java.util.Arrays;

public class Morpion {

    public static void drawMorpion(BigTurtle tortie, int[] pos, boolean circle) {

        if (circle) {
            tortie.jumpTo(100*pos[0] + 150, 100*pos[1] + 120);
            tortie.turnRightRadius(360, 30);
        } else {
            tortie.jumpTo(100*pos[0] + 120, 100*pos[1] + 120);
            tortie.turnRight(45);
            tortie.forward((int)(60*Math.sqrt(2)));
            tortie.jumpTo(100*pos[0] + 120, 100*pos[1] + 180);
            tortie.turnLeft(90);
            tortie.forward((int)(60*Math.sqrt(2)));
            tortie.turnRight(45);
        }
    }

    public static int[] askPos() {
        String position = "";
        boolean posValid = false;

        do {
            position = Clavier.rend_String("");
            posValid = position.length() == 2 && position.charAt(1) >= '1' && position.charAt(1) <= '3'
                    && (position.charAt(0) >= 'A' && position.charAt(0) <= 'C'
                    || position.charAt(0) >= 'a' && position.charAt(0) <= 'c');
            if (!posValid) {
                System.out.println("Cette position est invalide.");
            }
        } while (!posValid);

        int[] pos = new int[2];
        pos[1] = position.charAt(0) - (position.charAt(0) >= 'a'? 97 : 65);
        pos[0] = position.charAt(1) - 49;

        return pos;
    }

    public static int checkWin(int[][] morpion) {
        int winPlace = 0;
        if (morpion[0][0] == morpion[1][0] && morpion[0][0]== morpion[2][0] && morpion[0][0] != 0) {
            winPlace = 1;
        } else if (morpion[0][1] == morpion[1][1] && morpion[0][1]== morpion[2][1] && morpion[0][1] != 0) {
            winPlace = 2;
        } else if (morpion[0][2] == morpion[1][2] && morpion[0][2]== morpion[2][2] && morpion[0][2] != 0) {
            winPlace = 3;
        } else if (morpion[0][0] == morpion[0][1] && morpion[0][0]== morpion[0][2] && morpion[0][0] != 0) {
            winPlace = 4;
        } else if (morpion[1][0] == morpion[1][1] && morpion[1][0]== morpion[1][2] && morpion[1][0] != 0) {
            winPlace = 5;
        } else if (morpion[2][0] == morpion[2][1] && morpion[2][0]== morpion[2][2] && morpion[2][0] != 0) {
            winPlace = 6;
        } else if (morpion[0][0] == morpion[1][1] && morpion[0][0]== morpion[2][2] && morpion[0][0] != 0) {
            winPlace = 7;
        } else if (morpion[0][2] == morpion[1][1] && morpion[0][2]== morpion[2][0] && morpion[0][2] != 0) {
            winPlace = 8;
        }
        return winPlace;
    }

    public static void main(String[] args) throws InterruptedException {
        BigTurtle tortie = new BigTurtle(500, 600, 1000, 100, "pendu", Color.WHITE);
        tortie.setPenFont(new Font("Courier", Font.BOLD, 16));
        tortie.appear(1);
        tortie.turnRight(90);

        tortie.jumpTo(100, 200);
        tortie.forward(300);
        tortie.jumpTo(100, 300);
        tortie.forward(300);

        tortie.turnRight(90);
        tortie.jumpTo(200, 100);
        tortie.forward(300);
        tortie.jumpTo(300, 100);
        tortie.forward(300);
        tortie.turnLeft(90);

        tortie.jumpTo(140, 90);
        tortie.write("1");
        tortie.jumpTo(240, 90);
        tortie.write("2");
        tortie.jumpTo(340, 90);
        tortie.write("3");

        tortie.jumpTo(70, 160);
        tortie.write("A");
        tortie.jumpTo(70, 260);
        tortie.write("B");
        tortie.jumpTo(70, 360);
        tortie.write("C");

        // ESSAIS

        // ESSAIS

        tortie.disappear();

        int[][] morpion = new int[3][3];
        boolean joueur1 = true;
        int win = 0;

        do {
            int[] pos = new int[2];
            do {
                pos = askPos();
                System.out.println(Arrays.toString(pos));
                if (morpion[pos[0]][pos[1]] != 0) {
                    System.out.println("Cette case est déjà occupée.");
                }
            } while (morpion[pos[0]][pos[1]] != 0);

            morpion[pos[0]][pos[1]] = joueur1? 1 : 2;
            drawMorpion(tortie, pos, joueur1);

            win = checkWin(morpion);
            if (win == 0) {
                joueur1 = !joueur1;
            }
        } while (win == 0);

        tortie.setPenColor(Color.RED);
        switch (win) {
            case 1 :
                tortie.jumpTo(100, 150);
                tortie.forward(300);
                break;
            case 2 :
                tortie.jumpTo(100, 250);
                tortie.forward(300);
                break;
            case 3 :
                tortie.jumpTo(100, 350);
                tortie.forward(300);
                break;
            case 4 :
                tortie.turnRight(90);
                tortie.jumpTo(150, 100);
                tortie.forward(300);
                tortie.turnLeft(90);
                break;
            case 5 :
                tortie.turnRight(90);
                tortie.jumpTo(250, 100);
                tortie.forward(300);
                tortie.turnLeft(90);
                break;
            case 6 :
                tortie.turnRight(90);
                tortie.jumpTo(350, 100);
                tortie.forward(300);
                tortie.turnLeft(90);
                break;
            case 7 :
                tortie.turnRight(45);
                tortie.jumpTo(100, 100);
                tortie.forward((int)(300*Math.sqrt(2)));
                tortie.turnLeft(45);
                break;
            case 8 :
                tortie.turnLeft(45);
                tortie.jumpTo(100, 400);
                tortie.forward((int)(300*Math.sqrt(2)));
                tortie.turnRight(45);
                break;
        }

        tortie.setPenColor(Color.BLACK);
        tortie.jumpTo(170, 450);
        tortie.write("Les " + (joueur1? "ronds" : "croix") + " ont gagné !");

        System.out.println(joueur1);
    }
}
