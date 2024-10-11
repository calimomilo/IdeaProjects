import ch.comem.Clavier;

public class S3ex06 {
    public static void main(String[] args) {
        int saisie = 0;
        int counter = 0;

        for (int i = 1; i <= 5; i++) {
            saisie = Clavier.rend_int("Entrez le " + i + "e nombre : ");
            if (saisie <= 15) {
                counter++;
            }
        }
        System.out.println("Il y a " + counter + " nombre(s) <= 15.");
    }
}
