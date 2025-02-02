package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex09 {
    public static void main(String[] args) {
        int[] list = new int[12];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*6+1);
        }

        int[] occurrences = new int[6];
        for (int e : list) {
            occurrences[e - 1]++;
        }

        System.out.print("[");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");

        int max = 0;
        for (int occurrence : occurrences) {
            if (occurrence > max) {
                max = occurrence;
            }
        }

        String[][] tableau = new String [max][6];
        for (int i = 0; i < occurrences.length; i++) {
            for (int j = 0; j < occurrences[i]; j++) {
                tableau[max-j-1][i] = "X";
            }
        }

        for (String[] row : tableau) {
            for (String str : row) {
                String msg = str==null ? " " : str;
                System.out.print(msg + " ");
            }
            System.out.println();
        }
        System.out.println("1 2 3 4 5 6");

        /*
        // Version ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add((int)(Math.random()*6+1));
        }

        System.out.println(list + "\n");

        int max = 0;
        for (int i = 1; i <= 6; i++) {
            if (Collections.frequency(list, i) > max) {
                max = Collections.frequency(list, i);
            }
        }

        String[][] tableau = new String [max][6];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= Collections.frequency(list, i); j++) {
                tableau[max-j][i-1] = "X";
            }
        }

        for (String[] row : tableau) {
            for (String str : row) {
                String msg = str==null ? " " : str;
                System.out.print(msg + " ");
            }
            System.out.println();
        }
        System.out.println("1 2 3 4 5 6");
         */
    }
}
