package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex08 {
    public static void main(String[] args) {
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
    }
}
