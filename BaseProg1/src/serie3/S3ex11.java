package serie3;

import ch.comem.Clavier;

public class S3ex11 {
    public static void main(String[] args) {
        int currFib = 0;
        int lastFib = 0;
        byte n = Clavier.rend_byte("Quel est l'ordre du nombre de la suite de Fibonacci à calculer ? ");

        for (int i = 0; i <= n; i++) {

            switch (i) {
                case 0: break;
                case 1: currFib = 1; break;
                default:
                    // System.out.println(lastFib +" " + currFib);
                    int tmp = lastFib;
                    lastFib = currFib;
                    currFib += tmp;
                    break;
            }

            System.out.println("f(" + i + ") = " + currFib);
        }
    }
}
