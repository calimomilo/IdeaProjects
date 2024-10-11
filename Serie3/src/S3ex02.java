import ch.comem.Clavier;

public class S3ex02 {
    public static void main(String[] args) {
        int nombre = 0;

        do {
            nombre = Clavier.rend_int("Veuillez entrer un nombre strictement positif : ");
            if (nombre <= 0) {
                System.out.println("Le nombre saisi n'est pas strictement positif.");
            }
        } while (nombre <= 0);

        System.out.println("Compte à rebours à partir de " + nombre + ".");
        for (int i = nombre; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
