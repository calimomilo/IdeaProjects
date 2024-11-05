package serie3b;

import ch.comem.Clavier;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            System.out.println((int)(Math.random()*6)+1);
//        }
//
//        System.out.println("\n\n");
//
//        for (int i = 0; i < 20; i++) {
//            System.out.printf("%.1f\n", Math.random()*(41.5+41.8+1)-41.8);
//        }
//
//        System.out.println("\n\n");
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println((char)(Math.random()*('z'-'a'+1)+'a'));
//        }
//
//        System.out.println("\n\n");
//
//        String[] dictons = {"On a souvent besoin d'un plus petit que soi.", "Vieille amitié ne craint pas la rouille.",
//                "Mieux vaut tard que jamais.", "En avril, ne te découvre pas d'un fil.", "Rira bien qui rira le dernier."};
//
//        int index = (int) (Math.random()*5+1);
//        System.out.println(dictons[index]);
//
//        int[] tab = {1, 2, 3};
//        System.out.println(tab);
//
//        char[] list = new char[3];
//        System.out.println((int)(list[0]));

        double[] essais = new double[10];

        for (int i = 0; i < essais.length; i++) {
            System.out.println("Essai " + (i+1));

            Clavier.rend_String("Appuyez sur ENTER pour démarrer le chrono.");
            long t1 = System.currentTimeMillis();
            Clavier.rend_String("Appuyez sur ENTER pour arrêter le chrono.");
            long t2 = System.currentTimeMillis();
            essais[i] = (t2-t1)/1000.0;

            System.out.println("Votre essai : " + essais[i] + " [s]\n\n");
        }

        double ecartMin = Double.MAX_VALUE;
        int essaiMax = 0;

        for (int i = 0; i < essais.length; i++) {
            System.out.println("Essai " + (i+1) + " : " + essais[i] + " [s]");
            if (Math.abs(essais[i]-1) < ecartMin) {
                ecartMin = Math.abs(essais[i]-1);
                essaiMax = i+1;
            }
        }

        System.out.println("Votre meilleur essai est le " + essaiMax + "e avec un écart de " + ecartMin + " [s]");
    }
}