package Chess;

public class Main {
    public static void main(String[] args) {
        Chessboard chess = new Chessboard(Color.BLUE_BACKGROUND_BRIGHT, Color.GREEN_BACKGROUND_BRIGHT);
        Piece horse = new Piece('♘');
        Position pos = new Position(chess);

        System.out.println(chess);
        pos.askPosition();
        chess.placePiece(horse, pos);

        while (true) {
            horse.printMoves();
            pos.askPosition();
            horse.movePiece(pos);
        }

    }
}
