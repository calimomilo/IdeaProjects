package ProjetCaroline;

import ch.comem.turtle.BigTurtle;

import java.awt.*;

public class SunMoon {
    public static void main(String[] args) {
        BigTurtle ground = new BigTurtle();
        BigTurtle sun = new BigTurtle();

        ground.setPenColor(Color.getHSBColor(0.092f,0.4f,0.83f));
        int[] tabX = {0, 0, 1200, 1200};
        int[] tabY = {400, 700, 700, 400};
        ground.fillPolygon(tabX,tabY,4);

        sun.setPenColor(Color.BLACK);
        sun.forward(100);

    }

}
