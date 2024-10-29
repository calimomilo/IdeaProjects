package serie3b;

public class S4ex01 {
    public static void main(String[] args) {

        System.out.println("pairs\n");

        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        };

        System.out.println("\npairs et multiples de 7\n");

        for (int i = 0; i <= 100; i+=2) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\npairs et multiples de 3 et 7\n");

        for (int i = 0; i <= 100; i+=2) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\npairs et multiples de 3 mais pas de 7\n");

        for (int i = 0; i <= 100; i+=2) {
            if (i % 3 == 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
}
