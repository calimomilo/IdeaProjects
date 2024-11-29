package Chess;

import ch.comem.Clavier;

public class Position {
    private final Chessboard chessboard;
    private int row;
    private int col;

    public Position(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    public Position(Chessboard chessboard, String pos) {
        this.chessboard = chessboard;
        setCoords(pos);
    }

    public Chessboard getChessboard() {
        return chessboard;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean setCoords(String pos) {
        boolean success = false;
        char[] string = pos.toCharArray();
        char a = string[0];
        char b = string[1];

        if (pos.length() == 2) {
            if (b >= '1' && b <= (char) ('1'+this.chessboard.getSize()-1)) {
                if (a >= 'A' && a <= (char)('A'+this.chessboard.getSize()-1)) {
                    success = true;
                } else if (a >= 'a' && a <= (char)('h'+this.chessboard.getSize()-1)) {
                    a -= 32;
                    success = true;
                }
            }
        }

        if (success) {
            this.row = 56-b;
            this.col = (int) a-65;
        }
        return success;
    }

    public String getCoords() {
        return "[" + this.row + ", " + this.col + "]";
    }

    public String toString() {
        char c = (char) ('A' + this.col);
        return String.valueOf(c) + (8 - this.row);
    }


    public void askPosition() {
        boolean success = false;
        do {
            success = setCoords(Clavier.rend_String("Où placez-vous votre pion ?"));
            if (!success) {
                System.out.println("Saisie invalide.");
            }
        } while (!success);
    }
}
