package ProjetCaroline;

import ch.comem.Clavier;
import ch.comem.turtle.BigTurtle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BigTurtle anastasia = new BigTurtle();
        //anastasia.appear(1);
        anastasia.setPenColor(Color.red);

//        // carré
//        for (int i = 1; i <= 4; i++) {
//            anastasia.forward(100);
//            anastasia.turnRight(90);
//        }
//
//        // fleur
//        int nombre = 0;
//        do {
//            nombre = Clavier.rend_int("Entrez un nombre entre 1 et 10.");
//        } while (nombre < 1 || nombre > 10);
//
//        for (int i = 0; i < nombre; i++) {
//            anastasia.turnRightRadius(360, 50);
//            anastasia.turnRight((360.0/nombre));
//        }
//
//        // texte
//        anastasia.write("Hello World :)");

        anastasia.turnRight(90);
        anastasia.jumpTo(400,300);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 60; j++) {
                anastasia.clearGraphics();
                anastasia.penUp();
                anastasia.forward(j/10);
                anastasia.penDown();
                anastasia.fillArc(anastasia.getXPos(), anastasia.getYPos(), 100, 0, 360);
                anastasia.sleep(40);
            }
            for (int j = 60; j > 0; j--) {
                anastasia.clearGraphics();
                anastasia.penUp();
                anastasia.forward(j/10);
                anastasia.penDown();
                anastasia.fillArc(anastasia.getXPos(), anastasia.getYPos(), 100, 0, 360);
                anastasia.sleep(40);
            }
            anastasia.turnRight(180);
        }
    }
}
