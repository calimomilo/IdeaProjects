package ProjetCaroline;

import ch.comem.turtle.BigTurtle;

import java.awt.*;
import java.util.Random;

public class LogoWindows {

    public static void drawRectangle(BigTurtle turtle) {
        turtle.penDown();
        int[] tabX = {turtle.getXPos(), turtle.getXPos(), turtle.getXPos()+200, turtle.getXPos()+200};
        int[] tabY = {turtle.getYPos(), turtle.getYPos()+100, turtle.getYPos()+100, turtle.getYPos()};
        turtle.fillPolygon(tabX, tabY, 4);
        turtle.penUp();
    }
    public static void main(String[] args) {
        int WIDTH = 1000;
        int HEIGHT = 700;
        float i = 0;

        BigTurtle turtle = new BigTurtle(WIDTH, HEIGHT, 200, 50, "windows", Color.BLACK);
        turtle.setPenColor(Color.WHITE);
        turtle.setDirection(Math.random()*360);

        while (true) {
            turtle.sleep(40);
            turtle.clearGraphics();

            i+= 1/2700f;
            turtle.setPenColor(Color.getHSBColor(i, 1, 1));
            drawRectangle(turtle);

            turtle.forward(5);
            if (turtle.getXPos() >= WIDTH-10-200 || turtle.getXPos() <= 0) {
                turtle.setDirection(180-turtle.getDirection());
            }

            if (turtle.getYPos() >= HEIGHT-35-100 || turtle.getYPos() <= 0) {
                turtle.setDirection(0-turtle.getDirection());
            }

        }
    }
}
