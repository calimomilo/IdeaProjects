package serie4;

import ch.comem.Clavier;

public class S4ex07 {
    public static void main(String[] args) {
        String phrase = Clavier.rend_String("Entrez votre phrase : ");
        String[] phrases = phrase.split(" ");

        for (String mot : phrases) {
            System.out.println(mot);
        }
    }
}
