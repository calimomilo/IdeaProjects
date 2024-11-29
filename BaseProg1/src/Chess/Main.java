package Chess;

public class Main {
    public static void main(String[] args) {
        Chessboard chess = new Chessboard(Color.BLUE_BACKGROUND_BRIGHT, Color.GREEN_BACKGROUND_BRIGHT);
        System.out.println(chess);

        Position pos = new Position(chess);
        pos.askPosition();
        System.out.println(pos);
        System.out.println(pos.getCoords());
    }
}
