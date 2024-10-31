package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex08 {
    public static void main(String[] args) {
        int[] list = new int[12];
        int[] occurrences = new int[6];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*6+1);
        }

        for (int e : list) {
            occurrences[e - 1]++;
        }

        System.out.print("[");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");

        for (int i = 1; i <= occurrences.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < occurrences[i-1]; j++) {
                System.out.print("X");
            }
            System.out.println();
        }


        /*
        // Version ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add((int)(Math.random()*6+1));
        }

        for (int i = 1; i <= 6; i++) {
            System.out.print("\n" + i + " ");
            for (int j = 0; j < Collections.frequency(list, i); j++) {
                System.out.print("X");
            }
        }

         */
    }
}
