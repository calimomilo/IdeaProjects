package serie3;

import ch.comem.Clavier;

public class S3ex05 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int saisie = 0;

        for (int i = 1; i <= 5; i++) {
            saisie = Clavier.rend_int("Entrez le " + i + "e nombre : ");
            min = Math.min(saisie, min);
            max = Math.max(saisie, max);
        }
        System.out.println("Le plus petit nombre saisi est : " + min + "\nLe plus grand nombre saisi est : " + max);
    }
}
