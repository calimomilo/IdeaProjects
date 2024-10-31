package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*10));
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " => " + Collections.frequency(list, i) + " occurences");
        }
    }
}
