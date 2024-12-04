package Chess;

import java.util.ArrayList;

public class Piece {
    private char piece;
    private Position position;
    private ArrayList<String> memory = new ArrayList<String>();

    public Piece(char piece) {
        setPiece(piece);
    }

    public Piece(char piece, Position position) {
        setPiece(piece);
        setPosition(position);
    }

    public char getPiece() {
        return piece;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = new Position(position.getChessboard(), position.toString());

        memory.add(position.toString());
    }

    public ArrayList<String> getMemory() {
        return memory;
    }

    public boolean checkMove(Position position) {
        return checkMove(position.getRow(), position.getCol());
    }

    public boolean checkMove(int row, int col) {
        boolean valid = false;
        int diffRow = Math.abs(row - getPosition().getRow());
        int diffCol = Math.abs(col - getPosition().getCol());

        if ((diffRow == 1 && diffCol == 2) || (diffRow == 2 && diffCol == 1)) {
            valid = true;
        }
        return valid;
    }

    public byte printMoves() {
        byte moves = 0;
        Chessboard board = getPosition().getChessboard();
        System.out.print("\t\t");
        for (int i = 0; i < board.getSize(); i++) {
            System.out.print(" " + (char)(65+i) + "\t");
        }

        for (int i = 0; i < board.getSize(); i++) {
            System.out.print("\n   " + (8-i) + "\t");
            for (int j = 0; j < board.getSize(); j++) {
                if (checkMove(i,j) && board.getBoard()[i][j].isEmpty()) {
                    moves++;
                    System.out.print(Color.PURPLE_BACKGROUND_BRIGHT + " " + board.getBoard()[i][j] + "\t" + Color.RESET);
                } else {
                    if ((i+j)%2 == 0) {
                        System.out.print(board.getColor1() + " " + board.getBoard()[i][j] + "\t" + Color.RESET);
                    } else {
                        System.out.print(board.getColor2() + " " + board.getBoard()[i][j] + "\t" + Color.RESET);
                    }
                }
            }
            System.out.print("\t" + (8-i));
        }

        System.out.print("\n\t\t");
        for (int i = 0; i < board.getSize(); i++) {
            System.out.print(" " + (char)(65+i) + "\t");
        }
        System.out.println();
        return moves;
    }
}
