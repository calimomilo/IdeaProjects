import ch.comem.Clavier;

public class S3ex12 {
    public static void main(String[] args) {
        byte a = Clavier.rend_byte("Dimension du carré : ");
        byte b = (byte) (a + 1);
        int c = a * b;

        if (a % 2 == 0) {
            for (int i = 2; i <= c; i++) {
                String msg = (i % 2 == 0)
                        ? "o"
                        :"#";
                System.out.print(msg + "  ");
                if (i % b == 0) {
                    i++;
                    System.out.print("\n");
                }
            }
        } else {
            for (int i = 1; i <= a*a; i++) {
                String msg = (i % 2 == 0)
                        ? "#"
                        :"o";
                System.out.print(msg + "  ");
                if (i % a == 0) {
                    System.out.print("\n");
                }
            }
        }

    }
}
