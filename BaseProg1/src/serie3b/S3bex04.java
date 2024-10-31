package serie3b;

public class S3bex04 {
    public static void main(String[] args) {
        int pile = 0;
        int face = 0;

        int counter = 1;
        int lastThrow = 0;

        int maxPile = 0;
        int maxFace = 0;

        for (int i = 0; i < 1000; i++) {

            if (Math.random() < 0.5) {
                pile++;
                if (lastThrow == 1) {
                    counter++;
                } else {
                    if (counter > maxFace) {
                        maxFace = counter;
                    }
                    counter = 1;
                }
                lastThrow = 1;

            } else {
                face++;
                if (lastThrow == 2) {
                    counter++;
                } else {
                    if (counter > maxPile) {
                        maxPile = counter;
                    }
                    counter = 1;
                }
                lastThrow = 2;
            }
        }

        System.out.println("Pile: " + pile + " - " + maxPile + " fois de suite au maximum");
        System.out.println("Face: " + face + " - " + maxFace + " fois de suite au maximum");
    }
}
