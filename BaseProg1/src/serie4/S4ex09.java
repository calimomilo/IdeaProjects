package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex09 {
    public static void main(String[] args) {
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
    }
}
