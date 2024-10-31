package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex06 {
    public static void main(String[] args) {
        int[] list = new int[100];
        int[] occurences = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*10);
        }

        for (int i : list) {
            occurences[i]++;
        }

        for (int i = 0; i < occurences.length; i++) {
            System.out.println(i + " => "+ occurences[i] + " occurences");
        }

        /*
        // Version ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*10));
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " => " + Collections.frequency(list, i) + " occurences");
        }

         */
    }
}
