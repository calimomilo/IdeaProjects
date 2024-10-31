package serie4;

import ch.comem.Clavier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class S4ex03 {
    public static void main(String[] args) {
        ArrayList<String> file = new ArrayList<>();
        Collections.addAll(file, "Aline", "Roger", "Julia", "Steven", "Jules");

        String prenom = Clavier.rend_String("Veuillez saisir un prénom : ");

        if (file.contains(prenom)) {
            int position = file.indexOf(prenom) + 1;
            System.out.println(prenom + " se trouve en " + position + "e position dans la file");
        } else {
            System.out.println(prenom + " ne se trouve pas dans la file");
        }
    }
}
