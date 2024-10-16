public class S3ex12 {
    public static void main(String[] args) {

        for (int i = 2; i <= 72; i++) {
            String msg = (i % 2 == 0)
                    ? "o"
                    :"#";
            System.out.print(msg + "  ");
            if (i % 9 == 0) {
                i++;
                System.out.print("\n");
            }
        }
    }
}
