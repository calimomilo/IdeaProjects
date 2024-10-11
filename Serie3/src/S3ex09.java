import ch.comem.Clavier;

public class S3ex09 {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        double moyenne = 0;
        byte n = Clavier.rend_byte("Combien de notes voulez-vous calculer ? ");

        for (int i = 1; i <= n; i++) {
            double note = 0;
            boolean isNoteInvalide = false;
            do {
                note = Clavier.rend_double("Note " + i + ": ");
                isNoteInvalide = note < 1.0 || note >6.0;
                if (isNoteInvalide) {
                    System.out.println("Note invalide");
                }
            } while (isNoteInvalide);
            moyenne += note/n;
            if (note > max) {
                max = note;
            }
        }

        System.out.println("Votre moyenne : " + moyenne + "\nVotre meilleure note : " + max);
    }
}
