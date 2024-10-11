import ch.comem.Clavier;

public class S3ex01 {
    public static void main(String[] args) {
        byte nombre = 0;
        do {
            nombre = Clavier.rend_byte("Veuillez saisir un nombre dans l'intervalle [1;3]\n");
            if (nombre < 1 || nombre > 3) {
                System.out.println("La valeur " + nombre + " ne fait pas partie de l'intervalle spécifié...");
            }
        } while (nombre < 1 || nombre > 3);
        System.out.println("La valeur " + nombre + " est correcte");
    }
}

