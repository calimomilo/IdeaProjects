package serie5;

import ch.comem.Clavier;

public class S5ex01 {
    public static void printSum(double a, double b, double c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    public static double calcSum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        printSum(4.5, 5.2, 6.4);
        System.out.println(calcSum(4.5, 5.2, 6.4));
    }
}
