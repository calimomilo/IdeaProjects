package serie6;

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

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        System.out.println(indexOf(tab, 1));
    }
}
