package serie3b;

import ch.comem.Clavier;

public class S4ex05 {
    public static void main(String[] args) {
        int dahu = (int) Math.round(Math.random()*1000 + 1000);
        int counter = 0;
        int guess = 0;
        // System.out.println(dahu);

        do {
            boolean isInvalid = false;

            do {
                guess = Clavier.rend_int("Entrez une altitude entre 1000 et 2000 : ");
                isInvalid = guess < 1000 || guess > 2000;
                if (isInvalid) {
                    System.out.println("Altitude non valable !\n");
                }
            } while (isInvalid);

            counter++;

            String msg = guess < dahu
                    ? "Vous êtes trop bas."
                    : guess > dahu
                    ? "Vous êtes trop haut."
                    : "Bravo ! Vous avez trouvé le Dahu en " + counter + " coup(s).";
            System.out.println(msg + "\n");

            } while (guess != dahu);
    }
}
