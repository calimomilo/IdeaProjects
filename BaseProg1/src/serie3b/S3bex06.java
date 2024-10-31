package serie3b;

import ch.comem.Clavier;

public class S3bex06 {
    public static void main(String[] args) {
        int maxLimit = 90;
        int minLimit = 30;

        int counter = 0;
        int clavier = 3;

        do {
            counter++;

            int guess = Math.round((maxLimit - minLimit)/2.0f + minLimit);

            do {
                clavier = Clavier.rend_int("Ma proposition est " + guess + ".\nSi cettre proposition est trop haute, " +
                        "tapez 1.\nSi cette proposition est trop basse, tapez 2.\nSi cette proposition est correcte, tapez 0.\n");

                if (clavier < 0 || clavier > 2) {
                    System.out.println("Touche non valable !\n");
                }
            } while (clavier < 0 || clavier > 2);

            switch (clavier) {
                case 1: maxLimit = guess; break;
                case 2: minLimit = guess; break;
                case 0: System.out.println("Super ! Il m'a fallu " + counter + " essai(s)."); break;
            }
        } while (clavier != 0);
    }
}
