package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex04 {
    public static void main(String[] args) {
        String[] list = {"Aline", "Roger", "Julia", "Steven", "Jules"};

        System.out.print("Avant : [");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");

        String tmp = list[0];
        for (int i = 0; i < list.length-1; i++) {
            list[i] = list[i+1];
        }
        list[list.length-1] = tmp;

        System.out.print("Après : [");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");

        /*
        // Version ArrayList
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Aline", "Roger", "Julia", "Steven", "Jules");

        System.out.println("Avant : " + list);

        list.add(list.get(0));
        list.remove(list.get(0));

        System.out.println("Après : " + list);
         */
    }
}
