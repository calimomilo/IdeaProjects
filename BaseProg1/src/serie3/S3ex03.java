package serie3;

import ch.comem.Clavier;

public class S3ex03 {
    public static void main(String[] args) {

        int nombre = Clavier.rend_int("""
                    Ce programme affiche les nombres pairs entre 1 et la limite supérieure saisie par l'utilisateur.\n
                    Veuillez saisir un nombre plus grand que 2.\n""");

        System.out.println("Liste des nombres pairs entre 1 et " + nombre + ".");
        for (int i = 2; i <= nombre; i+=2) {
            System.out.println(i);
        }
    }
}
