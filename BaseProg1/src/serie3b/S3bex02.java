package serie3b;

import ch.comem.Clavier;

public class S3bex02 {
    public static void main(String[] args) {
        byte livret = Clavier.rend_byte("Veuillez saisir un livret : ");
        for (int i = 0; i <= 12; i++) {
            System.out.println(i + " x " + livret + " = " + livret * i);
        }
    }
}
