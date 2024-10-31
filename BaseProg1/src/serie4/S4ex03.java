package serie4;

import ch.comem.Clavier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class S4ex03 {
    public static void main(String[] args) {
        String[] file = {"Aline", "Roger", "Julia", "Steven", "Jules"};

        String prenom = Clavier.rend_String("Veuillez saisir un prénom : ");
        int place = 0;

        for (int i = 0; i < file.length; i++) {
            if (prenom.equals(file[i])) {
                place = i+1;
            }
        }

        String msg = place == 0
                ? (prenom + " ne se trouve pas dans la file")
                : (prenom + " se trouve en " + place + "e position dans la file");
        System.out.println(msg);

        /*
        // Version ArrayList
        ArrayList<String> file = new ArrayList<>();
        Collections.addAll(file, "Aline", "Roger", "Julia", "Steven", "Jules");

        String prenom = Clavier.rend_String("Veuillez saisir un prénom : ");

        if (file.contains(prenom)) {
            int position = file.indexOf(prenom) + 1;
            System.out.println(prenom + " se trouve en " + position + "e position dans la file");
        } else {
            System.out.println(prenom + " ne se trouve pas dans la file");
        }
         */
    }
}
