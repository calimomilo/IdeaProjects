package serie4;

import java.util.ArrayList;
import java.util.Collections;

public class S4ex02 {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9};
        int[] tmp = new int[9];

        System.out.print("Avant : [");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");

        for (int i = 0; i < list.length; i++) {
            tmp[i] = list[list.length-i-1];
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = tmp[i];
        }

        System.out.print("Après : [");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");


        /*
        // Version ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Avant : " + list);

        ArrayList<Integer> tmp = new ArrayList<Integer>();

        for (int i = list.size()-1; i >= 0 ; i--) {
            tmp.add(list.get(i));
        }

        list = tmp;
        System.out.println("Après : " + list);
         */
    }
}
