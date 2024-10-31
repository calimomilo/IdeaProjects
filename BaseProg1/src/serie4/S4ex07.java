package serie4;

import ch.comem.Clavier;

public class S4ex07 {
    public static void main(String[] args) {
        String phrase = Clavier.rend_String("Entrez votre phrase : ");
        String[] phrases = phrase.split(" ");

        for (int i = 0; i < phrases.length; i++) {
            System.out.println(phrases[i]);
        }
    }
}
