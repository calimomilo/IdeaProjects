package serie3b;

public class S3bex03 {
    public static void main(String[] args) {
        int pile = 0;
        int face = 0;

        for (int i = 0; i < 1000; i++) {
            if (Math.random() < 0.5) {
                pile++;
            } else {
                face++;
            }
        }

        System.out.println("Pile: " + pile + "\nFace: " + face);
    }
}
