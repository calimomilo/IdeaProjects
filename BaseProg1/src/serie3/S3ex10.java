package serie3;

import ch.comem.Clavier;

public class S3ex10 {
    public static void main(String[] args) {
        double max = 0;
        double somme = 0;
        byte counter = 1;
        boolean isNoteValide = false;
        double note = 0;

        do {
            note = Clavier.rend_double("Note " + counter + ": ");
            isNoteValide = note >= 1.0 && note <= 6.0;

            if (isNoteValide) {
                counter++;

                somme += note;

                if (note > max) {
                    max = note;
                }
            }
        } while (isNoteValide);


        System.out.println("Votre moyenne : " + somme / counter + "\nVotre meilleure note : " + max);
    }
}

