package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex05 {
    public static void main(String[] args) {
        double[] list = {0.7, 2, 5.5, 9, 13, 16.3, 18.1, 17.6, 14.8, 10.1, 5, 2.3};
        double max = 0;
        double min = Double.MAX_VALUE;
        double moyenne = 0;
        double moyenneVar = 0;

        for (double temp : list) {
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

        for (double temp : list) {
            moyenne += temp;
        }
        moyenne /= list.length;

        for (double temp : list) {
            moyenneVar += (Math.abs(moyenne - temp));
        }
        moyenneVar /= list.length;

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.printf("Étendue : %.2f\n", (max-min));
        System.out.printf("Moyenne : %.2f\n", moyenne);
        System.out.printf("Déviation moyenne : %.2f", moyenneVar);

        /*
        // Version ArrayList
        ArrayList<Double> list = new ArrayList<Double>();
        Collections.addAll(list, 0.7, 2.0, 5.5, 9.0, 13.0, 16.3, 18.1, 17.6, 14.8, 10.1, 5.0, 2.3);

        double moyenne = 0;
        for (Double d : list) {
            moyenne += d;
        }
        moyenne /= list.size();

        double variance = 0;
        for (Double d : list) {
            variance += Math.abs(d - moyenne);
        }
        variance /= list.size();

        System.out.println("Max : " + Collections.max(list));
        System.out.println("Min : " + Collections.min(list));
        System.out.printf("Étendue : %.2f\n", (Collections.max(list) - Collections.min(list)));
        System.out.printf("Moyenne : %.2f\n", moyenne);
        System.out.printf("Déviation moyenne : %.2f", variance);

         */
    }
}
