package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Aline", "Roger", "Julia", "Steven", "Jules");

        System.out.println("Avant : " + list);

        list.add(list.get(0));
        list.remove(list.get(0));

        System.out.println("Après : " + list);
    }
}
