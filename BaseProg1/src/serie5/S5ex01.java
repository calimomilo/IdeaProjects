package serie5;

import ch.comem.Clavier;

public class S5ex01 {
    public static void printSum(double a, double b, double c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    public static double calcSum(double a, double b, double c) {
        return a + b + c;
    }

    public static char toMaj(char a) {
        if (a >= 'a' && a <= 'z') {
            return (char) (a - 32);
        } else if (a >= 'A' && a <= 'Z') {
            return a;
        } else {
            System.out.println("Saisie invalide");
            return a;
        }
    }

    public static char toMin(char a) {
        if (a >= 'A' && a <= 'Z') {
            return (char) (a + 32);
        } else if (a >= 'a' && a <= 'z') {
            return a;
        }
        else {
            System.out.println("Saisie invalide");
            return a;
        }
    }

    public static String ucfirst(String s) {
        char[] sList = s.toCharArray();

        sList[0] = toMaj(sList[0]);
        for (int i = 1; i < sList.length; i++) {
            sList[i] = toMin(sList[i]);
        }

        return new String(sList);
    }

    public static String implode(char c, double[] list) {
        String s = "";

        s += list[0];
        for (int i = 1; i < list.length; i++) {
            s += c + " " + list[i];
        }

        return s;
    }

    public static String implode(char c, int[] list) {
        String s = "";

        s += list[0];
        for (int i = 1; i < list.length; i++) {
            s += c + " " + list[i];
        }

        return s;
    }

    public static int[] order(int[] list) {
        for (int j = list.length-2; j >= 0; j--) {
            for (int i = 0; i <= j; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        return list;
    }

    public static boolean contains(double[] list, double x) {
        boolean b = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == x) {
                b = true;
            }
        }
        return b;
    }

    public static double round(double value, int places) {
        double temp = value * Math.pow(10, places);
        return Math.round(temp) / Math.pow(10, places);
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        printSum(4.5, 5.2, 6.4);
        System.out.println(calcSum(4.5, 5.2, 6.4));
        System.out.println(toMaj('c'));
        System.out.println(toMin('D'));
        System.out.println(ucfirst("PAUL"));
        System.out.println(ucfirst("simone"));
        System.out.println(ucfirst("daNiEL"));
        System.out.println(implode(',', new double[]{5.5, 2, 7.6, 3.1, 56.4}));
        System.out.println(implode(',', order(new int[]{5, 6, 3, 1})));
        System.out.println(contains(new double[]{5.5, 2, 7.6, 3.1, 56.4}, 5.5));
        System.out.println(contains(new double[]{5.5, 2, 7.6, 3.1, 56.4}, 5.2));
        System.out.println(round(13.2347, 1));
        System.out.println(round(13.2347, 3));
        System.out.println(round(13.2347, 0));
        System.out.println(round(13.2347, -1));

        for (int i = 0; i < 10; i++) {
            System.out.println(random(10, 20));
        }
    }
}
