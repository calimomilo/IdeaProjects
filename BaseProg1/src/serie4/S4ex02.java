package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Avant : " + list);

        ArrayList<Integer> tmp = new ArrayList<Integer>();

        for (int i = list.size()-1; i >= 0 ; i--) {
            tmp.add(list.get(i));
        }

        list = tmp;
        System.out.println("Après : " + list);
    }
}
