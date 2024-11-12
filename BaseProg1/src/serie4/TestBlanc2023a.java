package serie4;

import ch.comem.Clavier;

public class TestBlanc2023a {
    public static void main(String[] args) {
        int a = Clavier.rend_int("Distance a [km] : ");
        int b = Clavier.rend_int("Distance b [km] : ");
        int c = Clavier.rend_int("Distance c [km] : ");


        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("1e distance : " + a + " [km]\n2e distance : " + b + " [km]\n3e distance : " + c + " [km]");
                } else if (b == c) {
                    System.out.println("1e distance : " + a + " [km]\n2e distances : " + b + " et " + c + " [km]");
                } else {
                    System.out.println("1e distance : " + a + " [km]\n2e distance : " + c + " [km]\n3e distance : " + b + " [km]");
                }
            } else if (a == c) {
                System.out.println("1e distances : " + a + " et " + c + " [km]\n2e distance : " + b + " [km]");
            } else {
                System.out.println("1e distance : " + c + " [km]\n2e distance : " + a + " [km]\n3e distance : " + b + " [km]");
            }
        } else if (a == b) {
            if (a > c) {
                System.out.println("1e distances : " + a + " et " + b + " [km]\n2e distance : " + c + " [km]");
            } else if (a == c) {
                System.out.println("1e distances : " + a + ", " + b + " et " + c + " [km]");
            } else {
                System.out.println("1e distance : " + c + " [km]\n2e distances : " + a + " et " + b + " [km]");
            }
        } else {
            if (a < c) {
                if (b > c) {
                    System.out.println("1e distance : " + b + " [km]\n2e distance : " + c + " [km]\n3e distance : " + a + " [km]");
                } else if (b == c) {
                    System.out.println("1e distances : " + b + " et " + c + " [km]\n2e distance : " + a + " [km]");
                } else {
                    System.out.println("1e distance : " + c + " [km]\n2e distance : " + b + " [km]\n3e distance : " + a + " [km]");
                }
            } else if (a == c) {
                System.out.println("1e distance : " + b + " [km]\n2e distances : " + a + " et " + c + " [km]");
            } else {
                System.out.println("1e distance : " + b + " [km]\n2e distance : " + a + " [km]\n3e distance : " + c + " [km]");
            }
        }
    }
}
