package serie6;

import ch.comem.Clavier;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S6Ex01 {

    public static int indexOf(int[] tab, int nombre) {
        int index = -1;
        int maxLim = tab.length-1;
        int minLim = 0;
        boolean found = false;

        do {
            int i = ((maxLim - minLim)/2) + minLim;
            if (nombre == tab[i]) {
                index = i;
                found = true;
            } else if (nombre > tab[i]) {
                minLim = i+1;
            } else {
                maxLim = i-1;
            }

            if (maxLim - minLim < 0) {
                found = true;
            }

        } while (!found);
        return index;
    }

    public static int findAsk(int[] tab) {
        int n = Clavier.rend_int("Quel nombre voulez-vous trouver?");
        int res = Arrays.binarySearch(tab, n);
        System.out.println(res <0 ? "Ce nombre ne se trouve pas dans le tableau." : "Ce nombre se trouve dans le tableau" +
                " à l'index " + res + ".");
        return res;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        System.out.println(indexOf(tab, 1));

        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));


        findAsk(tab);
    }
}
