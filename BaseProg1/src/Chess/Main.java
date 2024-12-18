package Chess;

public class Main {

    public static void placePiece(Piece piece, Chessboard chessboard, Position position) {
        if (chessboard.getBoard(position).isEmpty()) {
            if (piece.getPosition() != null) {
                if (piece.checkMove(position)) {
                    chessboard.getBoard()[piece.getPosition().getRow()][piece.getPosition().getCol()] = String.valueOf(piece.getMemory().size());
                    piece.setPosition(position);
                    chessboard.getBoard()[position.getRow()][position.getCol()] = String.valueOf(piece.getPiece());
                } else {
                    System.out.println("mouvement invalide");
                }
            } else {
                piece.setPosition(position);
                chessboard.getBoard()[position.getRow()][position.getCol()] = String.valueOf(piece.getPiece());
            }
        } else {
            System.out.println("case occupée");
        }
    }

    public static void playCavalier(Chessboard chess, Piece horse) {

        Position pos = new Position(chess);
        byte moves = 0;

        System.out.println(chess);

        do {
            pos.askPosition();
            placePiece(horse, chess, pos);
            moves = horse.printMoves();
            // System.out.println(horse.getMemory());
        } while (moves != 0);

        if (horse.getMemory().size() == 64) {
            System.out.println("Bravo ! Vous avez trouvé une solution au problème du chevalier.\n");
        } else {
            System.out.println("vous ne pouvez plus vous déplacer ! Vous avez effectué " + horse.getMemory().size() + " mouvements.");
        }
        System.out.println("Votre chemin : " + horse.getMemory());
    }

    public static void main(String[] args) {
        Chessboard chess = new Chessboard(Color.BLUE_BACKGROUND_BRIGHT, Color.GREEN_BACKGROUND_BRIGHT);
        Piece horse = new Piece('♞');

        playCavalier(chess, horse);
    }
}
